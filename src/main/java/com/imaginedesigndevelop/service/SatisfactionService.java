package com.imaginedesigndevelop.service;

import com.imaginedesigndevelop.model.Satisfaction;

import java.util.List;
import java.util.Optional;

public interface SatisfactionService {
    void save(Satisfaction satisfaction);

    Optional<Satisfaction> findById(Integer id);

    List<Satisfaction> findAll();

    void delete(Integer id);
}
