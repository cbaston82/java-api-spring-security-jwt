package com.imaginedesigndevelop.repository;

import com.imaginedesigndevelop.model.Satisfaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SatisfactionRepository extends JpaRepository<Satisfaction,
    Integer> {
}
