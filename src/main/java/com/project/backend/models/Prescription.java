package com.project.backend.models;

import jakarta.persistence.*;

@Entity
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String medicine;

    public Long getId() {
        return id;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }
}