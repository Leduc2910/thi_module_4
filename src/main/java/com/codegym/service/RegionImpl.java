package com.codegym.service;

import com.codegym.model.Region;
import com.codegym.repository.RegionRepository;
import com.codegym.service.intf.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionImpl implements RegionService {
    @Autowired
    private RegionRepository regionRepository;
    @Override
    public void save(Region region) {
        regionRepository.save(region);
    }

    @Override
    public void delete(Long id) {
        regionRepository.deleteById(id);
    }

    @Override
    public List<Region> findAll() {
        return regionRepository.findAll();
    }

    @Override
    public Optional<Region> findEById(Long id) {
        return regionRepository.findById(id);
    }
}
