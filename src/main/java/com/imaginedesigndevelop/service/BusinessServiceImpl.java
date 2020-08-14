package com.imaginedesigndevelop.service;

import com.imaginedesigndevelop.model.Business;
import com.imaginedesigndevelop.repository.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;
import java.util.Optional;

@Service
public class BusinessServiceImpl implements BusinessService {

    private BusinessRepository businessRepository;

    @Autowired
    public void setBusinessRepository(BusinessRepository businessRepository) {
        this.businessRepository = businessRepository;
    }

    @Override
    public void save(Business business) {
        businessRepository.save(business);
    }

    @Override
    public Optional<Business> findById(Integer id) {
        return businessRepository.findById(id);
    }

    @Override
    public List<Business> findByUserId(Integer id) {
        return businessRepository.findByUserId(id);
    }

    @Override
    public List<Business> findAll() {
        return businessRepository.findAll();
    }

    @Override
    @ModelAttribute("business")
    public void update(Business business) {
        save(business);
    }

    @Override
    public void delete(Integer id) {
        businessRepository.deleteById(id);
    }

    @Override
    public Optional<Business> getOne(Integer id) {
        return businessRepository.findById(id);
    }
}
