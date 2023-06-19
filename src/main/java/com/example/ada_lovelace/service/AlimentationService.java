package com.example.ada_lovelace.service;

import com.example.ada_lovelace.repository.AlimentationRepository;
import org.springframework.stereotype.Service;

@Service
public class AlimentationService {
    private final AlimentationRepository alimentationRepository;

    public AlimentationService(AlimentationRepository alimentationRepository) {
        this.alimentationRepository = alimentationRepository;
    }

    public AlimentationRepository getAlimentationRepository() {
        return alimentationRepository;
    }
}
