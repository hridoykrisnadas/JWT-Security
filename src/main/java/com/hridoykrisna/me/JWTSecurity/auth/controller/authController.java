package com.hridoykrisna.me.JWTSecurity.auth.controller;

import com.hridoykrisna.me.JWTSecurity.auth.service.AuthService;
import com.hridoykrisna.me.JWTSecurity.auth.user.AuthenticationResponse;
import com.hridoykrisna.me.JWTSecurity.auth.user.RegisterRequest;
import com.hridoykrisna.me.JWTSecurity.auth.user.AuthenticationRequest;
import com.hridoykrisna.me.JWTSecurity.util.UrlConstraint;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(UrlConstraint.AuthManagement.ROOT)
@RequiredArgsConstructor
public class authController {

    private final AuthService authService;

    @PostMapping(UrlConstraint.AuthManagement.REGISTER)
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(authService.register(request));
    }

    @GetMapping(UrlConstraint.AuthManagement.LOGIN)
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ){
        return ResponseEntity.ok(authService.authenticate(request));
    }
}
