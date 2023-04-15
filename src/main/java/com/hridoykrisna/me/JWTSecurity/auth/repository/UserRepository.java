package com.hridoykrisna.me.JWTSecurity.auth.repository;

import com.hridoykrisna.me.JWTSecurity.auth.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
