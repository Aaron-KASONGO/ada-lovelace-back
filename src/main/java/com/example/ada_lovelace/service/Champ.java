package com.example.ada_lovelace.service;

import com.example.ada_lovelace.repository.ChampRepository;
import org.springframework.stereotype.Service;

@Service
public class Champ {
    private final ChampRepository champRepository;

    public Champ(ChampRepository champRepository) {
        this.champRepository = champRepository;
    }

    public ChampRepository getChampRepository() {
        return champRepository;
    }
}
