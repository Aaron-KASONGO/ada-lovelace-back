package com.example.ada_lovelace.service;

import com.example.ada_lovelace.repository.TempsRepository;
import org.springframework.stereotype.Service;

@Service
public class TempsService {
    private final TempsRepository tempsRepository;

    public TempsService(TempsRepository tempsRepository) {
        this.tempsRepository = tempsRepository;
    }

    public TempsRepository getTempsRepository() {
        return tempsRepository;
    }
}
