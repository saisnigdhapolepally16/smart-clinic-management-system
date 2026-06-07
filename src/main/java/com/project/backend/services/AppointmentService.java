package com.project.backend.services;

import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    public String getAppointments() {
        return "Appointments Retrieved";
    }
}