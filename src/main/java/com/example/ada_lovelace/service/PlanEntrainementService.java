package com.example.ada_lovelace.service;

import com.example.ada_lovelace.repository.PlanEntrainementRepository;
import org.springframework.stereotype.Service;

@Service
public class PlanEntrainementService {
    private final PlanEntrainementRepository planEntrainementRepository;

    public PlanEntrainementService(PlanEntrainementRepository planEntrainementRepository) {
        this.planEntrainementRepository = planEntrainementRepository;
    }

    public PlanEntrainementRepository getPlanEntrainementRepository() {
        return planEntrainementRepository;
    }
}
