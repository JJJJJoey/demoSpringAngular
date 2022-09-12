package com.example.demospringangular.controller;

import com.example.demospringangular.domain.User;
import com.example.demospringangular.service.BaseService;
import com.example.demospringangular.service.UserService;
import com.example.demospringangular.transfer.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Email;
import java.util.NoSuchElementException;

@RestController
@RequiredArgsConstructor
@RequestMapping("users")
public class UserController extends AbstractController<User> {

    private final UserService userService;

    @Override
    public BaseService<User> getBaseService() {
        return userService;
    }

    @GetMapping(params = "email")
    public ResponseEntity<ApiResponse<User>> findByEmail(@Email @RequestParam String email) {
        final User byEmail = userService.findByEmail(email);
        if (byEmail == null) {
            throw new NoSuchElementException("Element not found");
        }
        return ResponseEntity.ok(ApiResponse.<User>builder().data(byEmail).build());
    }


}