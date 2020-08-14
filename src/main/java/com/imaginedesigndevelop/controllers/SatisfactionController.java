package com.imaginedesigndevelop.controllers;


import io.swagger.annotations.ApiOperation;
import com.imaginedesigndevelop.model.Satisfaction;
import com.imaginedesigndevelop.service.SatisfactionService;
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
public class SatisfactionController {

    private SatisfactionService satisfactionService;

    @Autowired
    public void setSatisfactionService(
        SatisfactionService satisfactionService) {
        this.satisfactionService = satisfactionService;
    }

    @ApiOperation(value = "Create a satisfaction")
    @PostMapping(value = "/satisfactions")
    @PreAuthorize("hasAuthority('admin:write')")
    public ResponseEntity<Void> addSatisfaction(
        @RequestBody Satisfaction satisfaction, UriComponentsBuilder builder) {
        satisfactionService.save(satisfaction);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/satisfactions/{id}").buildAndExpand(satisfaction.getId()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Get all satisfactions")
    @GetMapping(value = "/satisfactions")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_DASHBOARD', 'ROLE_MOBILE', " +
        "'ROLE_WEB_USER')")
    public ResponseEntity<List> getAllSatisfactions(
        UriComponentsBuilder builder) {
        List satisfactions = satisfactionService.findAll();
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(satisfactions, headers, HttpStatus.OK);
    }

    @ApiOperation(value = "Get a satisfaction by id")
    @GetMapping(value = "/satisfactions/{id}")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_DASHBOARD', 'ROLE_MOBILE', " +
        "'ROLE_WEB_USER')")
    public ResponseEntity<Optional<Satisfaction>> findSatisfactionById(
        @PathVariable("id") Integer id) {
        Optional<Satisfaction> satisfaction = satisfactionService.findById(id);
        return new ResponseEntity<>(satisfaction, HttpStatus.OK);
    }

    @ApiOperation(value = "Update a satisfaction")
    @PutMapping(value = "/satisfactions")
    @PreAuthorize("hasAuthority('admin:write')")
    public ResponseEntity<Satisfaction> updateUser(
        @RequestBody Satisfaction satisfaction) {
        satisfactionService.save(satisfaction);
        return new ResponseEntity<>(satisfaction, HttpStatus.OK);
    }

    @ApiOperation(value = "Delete a satisfaction by id")
    @DeleteMapping(value = "/satisfactions/{id}")
    @PreAuthorize("hasAuthority('admin:write')")
    public ResponseEntity<Void> deleteSatisfaction(
        @PathVariable("id") Integer id) {
        satisfactionService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
