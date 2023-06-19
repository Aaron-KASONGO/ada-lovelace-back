package com.example.ada_lovelace.service;

import com.example.ada_lovelace.repository.ObjectifRepository;
import org.springframework.stereotype.Service;

@Service
public class ObjectifService {
    private final ObjectifRepository objectifRepository;

    public ObjectifService(ObjectifRepository objectifRepository) {
        this.objectifRepository = objectifRepository;
    }

    public ObjectifRepository getObjectifRepository() {
        return objectifRepository;
    }
}
