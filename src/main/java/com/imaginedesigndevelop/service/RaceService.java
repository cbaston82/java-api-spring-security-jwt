package com.imaginedesigndevelop.service;

import com.imaginedesigndevelop.model.Race;

import java.util.List;
import java.util.Optional;

public interface RaceService {
    void save(Race race);

    Optional<Race> findById(Integer id);

    List<Race> findAll();

    void delete(Integer id);
}
