package com.imaginedesigndevelop.controllers;


import com.imaginedesigndevelop.model.Business;
import io.swagger.annotations.ApiOperation;
import com.imaginedesigndevelop.service.BusinessService;
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
public class BusinessController {

    private BusinessService businessService;

    @Autowired
    public void setBusinessService(BusinessService businessService) {
        this.businessService = businessService;
    }

    @ApiOperation(value = "Creates a new business")
    @PostMapping(value = "/businesses")
    @PreAuthorize("hasAuthority('admin:write')")
    public ResponseEntity<Void> addBusiness(@RequestBody Business business,
                                            UriComponentsBuilder builder) {
        businessService.save(business);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/businesses/{id}").buildAndExpand(business.getId()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Gets a list of all businesses")
    @GetMapping(value = "/businesses")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_DASHBOARD')")
    public ResponseEntity<List> getAllBusinesses(UriComponentsBuilder builder) {
        List business = businessService.findAll();
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(business, headers, HttpStatus.OK);
    }

    @ApiOperation(value = "Gets a business by id")
    @GetMapping(value = "/businesses/{id}")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_DASHBOARD')")
    public ResponseEntity<Optional<Business>> findBusinessById(
        @PathVariable("id") Integer id) {
        Optional<Business> business = businessService.findById(id);
        return new ResponseEntity<Optional<Business>>(business, HttpStatus.OK);
    }

    @ApiOperation(value = "Updates a business")
    @PutMapping(value = "/businesses")
    @PreAuthorize("hasAuthority('admin:write')")
    public ResponseEntity<Business> updateUser(@RequestBody Business business) {
        businessService.save(business);
        return new ResponseEntity<>(business, HttpStatus.OK);
    }

    @ApiOperation(value = "Deletes a business by id")
    @DeleteMapping(value = "/businesses/{id}")
    @PreAuthorize("hasAuthority('admin:write')")
    public ResponseEntity<Void> deleteBusiness(@PathVariable("id") Integer id) {
        businessService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
