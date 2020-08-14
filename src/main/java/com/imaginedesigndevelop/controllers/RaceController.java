package com.imaginedesigndevelop.controllers;

import io.swagger.annotations.ApiOperation;
import com.imaginedesigndevelop.model.Race;
import com.imaginedesigndevelop.service.RaceService;
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
public class RaceController {

    private RaceService raceService;

    @Autowired
    public void setRaceService(RaceService raceService) {
        this.raceService = raceService;
    }

    @ApiOperation(value = "Create a race")
    @PostMapping(value = "/races")
    @PreAuthorize("hasAuthority('admin:write')")
    public ResponseEntity<Void> addRace(@RequestBody Race race,
                                        UriComponentsBuilder builder) {
        raceService.save(race);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/races/{id}").buildAndExpand(race.getId()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Get all races")
    @GetMapping(value = "/races")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_DASHBOARD', 'ROLE_MOBILE', " +
        "'ROLE_WEB_USER')")
    public ResponseEntity<List> getAllRaces(UriComponentsBuilder builder) {
        List races = raceService.findAll();
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(races, headers, HttpStatus.OK);
    }

    @ApiOperation(value = "Get a race by id")
    @GetMapping(value = "/races/{id}")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_DASHBOARD', 'ROLE_MOBILE', " +
        "'ROLE_WEB_USER')")
    public ResponseEntity<Optional<Race>> findRaceById(
        @PathVariable("id") Integer id) {
        Optional<Race> race = raceService.findById(id);
        return new ResponseEntity<Optional<Race>>(race, HttpStatus.OK);
    }

    @ApiOperation(value = "Update a race")
    @PutMapping(value = "/races")
    @PreAuthorize("hasAuthority('admin:write')")
    public ResponseEntity<Race> updateUser(@RequestBody Race race) {
        raceService.save(race);
        return new ResponseEntity<>(race, HttpStatus.OK);
    }

    @ApiOperation(value = "Delete a race by id")
    @DeleteMapping(value = "/races/{id}")
    @PreAuthorize("hasAuthority('admin:write')")
    public ResponseEntity<Void> deleteRace(@PathVariable("id") Integer id) {
        raceService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
