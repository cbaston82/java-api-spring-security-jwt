package com.imaginedesigndevelop.controllers;

import com.imaginedesigndevelop.model.User;
import com.imaginedesigndevelop.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation(value = "Create a user")
    @PostMapping(value = "/users")
    @PreAuthorize("hasAuthority('admin:write')")
    public ResponseEntity<Void> addUser(@RequestBody User user,
                                        UriComponentsBuilder builder) {
        userService.save(user);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/users/{id}").buildAndExpand(user.getId()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Get all users")
    @GetMapping(value = "/users")
    @PreAuthorize("hasAuthority('admin:read')")
    public ResponseEntity<List> getAllUsers(UriComponentsBuilder builder) {
        List users = userService.findAll();
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(users, headers, HttpStatus.OK);
    }

    @ApiOperation(value = "Get a user by id")
    @GetMapping(value = "/users/{id}")
    @PreAuthorize("hasAuthority('admin:read')")
    public ResponseEntity<Optional<User>> findUserById(
        @PathVariable("id") Integer id) {
        Optional<User> user = userService.findById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @ApiOperation(value = "Get a user by username")
    @GetMapping(value = "/users/userName/{username}")
    @PreAuthorize("hasAuthority('admin:read')")
    public ResponseEntity<Optional<User>> findUserByUsername(
        @PathVariable("username") String username) {
        Optional<User> user = Optional.ofNullable(userService.findByUsername(username));
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @ApiOperation(value = "Update a user")
    @PutMapping(value = "/users")
    @PreAuthorize("hasAuthority('admin:write')")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        userService.save(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @ApiOperation(value = "Delete a user by id")
    @DeleteMapping(value = "/users/{id}")
    @PreAuthorize("hasAuthority('admin:write')")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") Integer id) {
        userService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
