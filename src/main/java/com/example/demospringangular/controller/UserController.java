package com.example.demospringangular.controller;

import com.example.demospringangular.domain.User;
import com.example.demospringangular.service.BaseService;
import com.example.demospringangular.service.UserService;
import com.example.demospringangular.transfer.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Email;
import java.util.NoSuchElementException;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
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

    @GetMapping(params = "firstname")
    public ResponseEntity<ApiResponse<User>> findByFirstName( @RequestParam String firstname) {
        final User findingByFirstName = userService.findByFirstName(firstname);

        if (findingByFirstName == null) {
            throw new NoSuchElementException("Element not found");
        }
        return ResponseEntity.ok(ApiResponse.<User>builder().data(findingByFirstName).build());
    }


}