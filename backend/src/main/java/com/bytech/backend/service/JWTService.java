package com.bytech.backend.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.bytech.backend.model.User;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class JWTService {
    @Value("${jwt.algorithm.key}") // "hello world!" encrypted with SHA3-256
    private String algorithmKey;
    @Value("${jwt.issuer}")
    private String issuer;
    @Value("${jwt.expiryInSeconds}") // 7 days
    private int expiryInSeconds;
    private Algorithm algorithm;
    private final static String USERNAME_KEY = "USERNAME";

    @PostConstruct
    public void postConstruct() {
        algorithm = Algorithm.HMAC512(algorithmKey);
    }

    public String generateToken(User user) {
        return JWT.create()
                .withClaim(USERNAME_KEY, user.getUsername())
                .withExpiresAt(new Date(System.currentTimeMillis() + (expiryInSeconds * 1000L)))
                .withIssuer(issuer)
                .sign(algorithm);
    }

    public String getUsernameFromJWT(String token) {
        return JWT.decode(token).getClaim(USERNAME_KEY).asString();
    }

}
