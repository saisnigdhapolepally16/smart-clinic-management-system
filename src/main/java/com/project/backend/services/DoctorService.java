package com.project.backend.services;

import com.project.backend.models.Doctor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {

    public List<Doctor> getAllDoctors() {

        List<Doctor> doctors = new ArrayList<>();

        doctors.add(new Doctor(1L,"John Smith","Cardiology"));
        doctors.add(new Doctor(2L,"David Lee","Neurology"));

        return doctors;
    }
}