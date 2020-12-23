package com.capp.tech.auth;

import lombok.Builder;
import lombok.Getter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;

@Getter
public class JWTPreAutenticationToken extends PreAuthenticatedAuthenticationToken {

    @Override
    public Object getCredentials() {
        return null;
    }

    @Builder
    public JWTPreAutenticationToken(UserDetails principal, WebAuthenticationDetails details) {
        super(principal, null, principal.getAuthorities());
        super.setDetails(details);


    }
}
