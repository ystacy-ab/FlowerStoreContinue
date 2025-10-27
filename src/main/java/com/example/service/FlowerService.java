package com.example.service;

import com.example.model.Flower;
import com.example.repository.FlowerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {
    private final FlowerRepository repo;

    public FlowerService(FlowerRepository repo) {
        this.repo = repo;
    }

    public List<Flower> listFlowers() {
        return repo.findAll();
    }
}
