package com.imaginedesigndevelop.service;

import com.imaginedesigndevelop.model.Gender;

import java.util.List;
import java.util.Optional;

public interface GenderService {
    void save(Gender gender);

    Optional<Gender> findById(Integer id);

    List<Gender> findAll();

    void delete(Integer id);
}
