package com.example.eventmanagementsystem.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtil {
    private static final String SECRET_KEY = "secret";

    /**
     * Generating token
     * @param username User username
     * @return JWT(Token)
     */
    public String generateJWT(String username) {
        return Jwts.builder().setSubject(username).setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+(1000*60*60)))
                .signWith(SignatureAlgorithm.HS256,SECRET_KEY).compact();
    }
}
