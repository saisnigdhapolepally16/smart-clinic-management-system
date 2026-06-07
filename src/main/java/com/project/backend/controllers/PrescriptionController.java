package com.project.backend.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prescriptions")
public class PrescriptionController {

    @GetMapping
    public String getPrescriptions() {
        return "Prescription Endpoint";
    }
}