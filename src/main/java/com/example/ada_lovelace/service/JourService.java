package com.example.ada_lovelace.service;

import com.example.ada_lovelace.repository.JourRepository;
import org.springframework.stereotype.Service;

@Service
public class JourService {
    private final JourRepository jourRepository;

    public JourService(JourRepository jourRepository) {
        this.jourRepository = jourRepository;
    }

    public JourRepository getJourRepository() {
        return jourRepository;
    }
}
