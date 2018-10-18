package com.itss.demo.controller;

import com.itss.demo.entity.User;
import com.itss.demo.service.UsersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("demo")
public class DemoController {

    private final UsersService usersService;

    public DemoController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/test")
    public ResponseEntity test(){
        Optional<User> optional = usersService.findOne(1);
        System.out.println(optional.get().getUserName());
        return ResponseEntity.ok(optional.get().getUserName());
    }

    @GetMapping("/test2")
    public ResponseEntity test2() {
        Optional<User> optional = usersService.findOne(1);
        System.out.println(optional.get().getUserName());
        return ResponseEntity.ok(optional.get().getUserName());
    }
}
