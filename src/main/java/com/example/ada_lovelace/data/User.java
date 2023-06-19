package com.example.ada_lovelace.data;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long id;
    private String nom;
    private int age;
    private double poids;
    private double taille;
    @OneToMany(mappedBy = "user")
    private List<Objectif> objectifList;
}
