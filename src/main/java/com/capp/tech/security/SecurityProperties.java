package com.capp.tech.security;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Duration;

@ConfigurationProperties(prefix = "capp.security")
@Getter
@Setter
@RequiredArgsConstructor
public class SecurityProperties {
    /**
     * Amount of hashing iterations, where formula is 2^passwordStrength iterations
     */
    private int passwordStrength;
    /**
     * Secret used to generate and verify JWT tokens
     */
    private String tokenSecret;
    /**
     * Name of the token issuer
     */
    private String tokenIssuer;
    /**
     * Duration after which a token will expire
     */
    private final Duration tokenExpiration = Duration.ofHours(4);
}
