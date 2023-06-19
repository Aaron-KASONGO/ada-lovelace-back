package com.example.ada_lovelace.repository;

import com.example.ada_lovelace.data.Alimentation;
import org.springframework.data.repository.CrudRepository;

public interface AlimentationRepository extends CrudRepository<Alimentation, Long> {
}
