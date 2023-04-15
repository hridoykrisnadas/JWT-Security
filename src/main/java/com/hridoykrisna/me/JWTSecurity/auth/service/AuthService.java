package com.hridoykrisna.me.JWTSecurity.auth.service;


import com.hridoykrisna.me.JWTSecurity.auth.user.AuthenticationRequest;
import com.hridoykrisna.me.JWTSecurity.auth.user.AuthenticationResponse;
import com.hridoykrisna.me.JWTSecurity.auth.user.RegisterRequest;

public interface AuthService {
    AuthenticationResponse register(RegisterRequest request);

    AuthenticationResponse authenticate(AuthenticationRequest request);
}
