package com.imaginedesigndevelop.controllers;

import com.imaginedesigndevelop.service.GenderService;
import io.swagger.annotations.ApiOperation;
import com.imaginedesigndevelop.model.Gender;
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
public class GenderController {

    private GenderService genderService;

    @Autowired
    public void setGenderService(GenderService genderService) {
        this.genderService = genderService;
    }

    @ApiOperation(value = "Create a gender")
    @PostMapping(value = "/genders")
    @PreAuthorize("hasAuthority('admin:write')")
    public ResponseEntity<Void> addGender(@RequestBody Gender gender,
                                          UriComponentsBuilder builder) {
        genderService.save(gender);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/genders/{id}").buildAndExpand(gender.getId()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Get all Genders")
    @GetMapping(value = "/genders")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_WEB_USER', " +
        "'ROLE_DASHBOARD', 'ROLE_MOBILE')")
    public ResponseEntity<List> getAllGenders(UriComponentsBuilder builder) {
        List genders = genderService.findAll();
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(genders, headers, HttpStatus.OK);
    }

    @ApiOperation(value = "Get a gender by id")
    @GetMapping(value = "/genders/{id}")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_WEB_USER', " +
        "'ROLE_DASHBOARD', 'ROLE_MOBILE')")
    public ResponseEntity<Optional<Gender>> findGenderById(
        @PathVariable("id") Integer id) {
        Optional<Gender> gender = genderService.findById(id);
        return new ResponseEntity<Optional<Gender>>(gender, HttpStatus.OK);
    }

    @ApiOperation(value = "Update a gender")
    @PutMapping(value = "/genders")
    @PreAuthorize("hasAuthority('admin:write')")
    public ResponseEntity<Gender> updateUser(@RequestBody Gender gender) {
        genderService.save(gender);
        return new ResponseEntity<>(gender, HttpStatus.OK);
    }

    @ApiOperation(value = "Delete a gender by id")
    @DeleteMapping(value = "/genders/{id}")
    @PreAuthorize("hasAuthority('admin:write')")
    public ResponseEntity<Void> deleteGender(@PathVariable("id") Integer id) {
        genderService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
