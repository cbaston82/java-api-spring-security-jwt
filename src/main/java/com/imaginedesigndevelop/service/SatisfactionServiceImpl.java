package com.imaginedesigndevelop.service;

import com.imaginedesigndevelop.model.Satisfaction;
import com.imaginedesigndevelop.repository.SatisfactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SatisfactionServiceImpl implements SatisfactionService {
    private SatisfactionRepository satisfactionRepository;

    @Autowired
    public void setSatisfactionRepository(
        SatisfactionRepository satisfactionRepository) {
        this.satisfactionRepository = satisfactionRepository;
    }

    @Override
    public void save(Satisfaction satisfaction) {
        satisfactionRepository.save(satisfaction);
    }

    @Override
    public Optional<Satisfaction> findById(Integer id) {
        return satisfactionRepository.findById(id);
    }

    @Override
    public List<Satisfaction> findAll() {
        return satisfactionRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        satisfactionRepository.deleteById(id);
    }
}
