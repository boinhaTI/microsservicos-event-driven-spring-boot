package com.microservice.user.controller;

import com.microservice.user.dtos.UserRequestDto;
import com.microservice.user.models.User;
import com.microservice.user.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody @Valid UserRequestDto userRequestDto) {
        var user = userService.save(userRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
