package com.imaginedesigndevelop.repository;

import com.imaginedesigndevelop.model.Business;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BusinessRepository extends JpaRepository<Business, Integer> {
    List<Business> findByUserId(Integer id);
}
