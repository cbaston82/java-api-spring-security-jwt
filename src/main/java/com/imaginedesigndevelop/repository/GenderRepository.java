package com.imaginedesigndevelop.repository;

import com.imaginedesigndevelop.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepository extends JpaRepository<Gender, Integer> {
}
