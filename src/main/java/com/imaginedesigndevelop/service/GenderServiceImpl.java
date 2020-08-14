package com.imaginedesigndevelop.service;

import com.imaginedesigndevelop.repository.GenderRepository;
import com.imaginedesigndevelop.model.Gender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenderServiceImpl implements GenderService {
    private GenderRepository genderRepository;

    @Autowired
    public void setGenderRepository(GenderRepository genderRepository) {
        this.genderRepository = genderRepository;
    }

    @Override
    public void save(Gender gender) {
        genderRepository.save(gender);
    }

    @Override
    public Optional<Gender> findById(Integer id) {
        return genderRepository.findById(id);
    }

    @Override
    public List<Gender> findAll() {
        return genderRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        genderRepository.deleteById(id);
    }
}
