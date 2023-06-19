package com.example.ada_lovelace.data;

import jakarta.persistence.Entity;

@Entity
public class Alimentation extends Activity{
    private String plat;
    private int quantite;
}
