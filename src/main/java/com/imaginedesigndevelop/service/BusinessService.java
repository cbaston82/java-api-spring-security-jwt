package com.imaginedesigndevelop.service;

import com.imaginedesigndevelop.model.Business;

import java.util.List;
import java.util.Optional;

public interface BusinessService {
    void save(Business business);

    Optional<Business> findById(Integer id);

    List<Business> findByUserId(Integer id);

    List<Business> findAll();

    void update(Business business);

    void delete(Integer id);

    Optional<Business> getOne(Integer id);
}
