package com.example.ada_lovelace.repository;

import com.example.ada_lovelace.data.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
