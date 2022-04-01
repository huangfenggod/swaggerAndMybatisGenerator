package com.hf.entity;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class JWTAuthenticationToken extends UsernamePasswordAuthenticationToken {
    public JWTAuthenticationToken(Object principal, Object credentials) {
        super(principal, credentials);
    }
}
