package com.codegym.service;

import com.codegym.model.City;
import com.codegym.repository.CityRepository;
import com.codegym.service.intf.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityImpl implements CityService {
    @Autowired
    private CityRepository cityRepository;
    @Override
    public void save(City city) {
        cityRepository.save(city);
    }

    @Override
    public void delete(Long id) {
cityRepository.deleteById(id);
    }

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public Optional<City> findEById(Long id) {
        return cityRepository.findById(id);
    }
}
