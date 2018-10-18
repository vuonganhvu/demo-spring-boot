package com.itss.demo.controller;

import com.itss.demo.entity.Role;
import com.itss.demo.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @PostMapping
    public ResponseEntity<String> login() {
        List<Role> roles = new ArrayList<>();
        roles.add(Role.ROLE_ADMIN);
        String token = jwtTokenProvider.createToken("tutorialspoint.com", roles);
        return ResponseEntity.ok(token);
    }
}
