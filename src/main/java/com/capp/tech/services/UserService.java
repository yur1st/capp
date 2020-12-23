package com.capp.tech.services;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;
import com.capp.tech.auth.BadTokenException;
import com.capp.tech.model.entity.User;
import com.capp.tech.repository.datajpa.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

import static java.util.Date.from;

@Service
public class UserService extends AbstractService<User, UserRepository> implements UserDetailsService {

    private final UserRepository userRepository;
    private JWTVerifier verifier;
    private Algorithm algorithm;


    public UserService(UserRepository repository, JWTVerifier verifier, Algorithm algorithm) {
        super(repository);
        this.userRepository = repository;
        this.verifier = verifier;
        this.algorithm = algorithm;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }

        return user;
    }

    @Transactional
    public UserDetails loadUserByToken(String token) throws BadTokenException {
        return getDecodedToken(token)
                .map(DecodedJWT::getSubject)
                .flatMap(userRepository::findByEmail)
                .orElseThrow(BadTokenException::new);
    }

    private Optional<DecodedJWT> getDecodedToken(String token) {
        try {
            return Optional.of(verifier.verify(token));
        } catch (JWTVerificationException ex) {
            return Optional.empty();
        }
    }

    public User getCurrentUser(String email) {
        return repository.findByEmail(email).get();
    }

    @Transactional
    public String getToken(User user) {
        Instant now = Instant.now();
        Instant expiry = Instant.now().plus(Duration.ofHours(2));
        return JWT
                .create()
                .withIssuer("my-graphql-api")
                .withIssuedAt(from(now))
                .withExpiresAt(from(expiry))
                .withSubject(user.getEmail())
                .sign(algorithm);
    }
}
