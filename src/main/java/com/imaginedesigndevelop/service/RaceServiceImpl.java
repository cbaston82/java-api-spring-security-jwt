package com.imaginedesigndevelop.service;

import com.imaginedesigndevelop.model.Race;
import com.imaginedesigndevelop.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RaceServiceImpl implements RaceService {
    private RaceRepository raceRepository;

    @Autowired
    public void setRaceRepository(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    @Override
    public void save(Race race) {
        raceRepository.save(race);
    }

    @Override
    public Optional<Race> findById(Integer id) {
        return raceRepository.findById(id);
    }

    @Override
    public List<Race> findAll() {
        return raceRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        raceRepository.deleteById(id);
    }
}
