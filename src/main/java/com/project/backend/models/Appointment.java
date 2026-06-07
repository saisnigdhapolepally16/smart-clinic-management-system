package com.project.backend.models;

import jakarta.persistence.*;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String appointmentDate;

    public Long getId() {
        return id;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
}