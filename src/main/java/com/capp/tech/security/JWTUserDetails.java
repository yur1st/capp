package com.capp.tech.security;

import com.capp.tech.model.entity.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

@Getter
@Builder
@RequiredArgsConstructor
public class JWTUserDetails implements UserDetails {
    private final String username;
    private final String password;
    private final List<Role> authorities;
    private final String token;

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
