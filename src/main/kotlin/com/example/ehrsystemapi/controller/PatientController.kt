package com.example.ehrsystemapi.controller

import com.example.ehrsystemapi.model.Patient
import com.example.ehrsystemapi.service.PatientService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/patients")
class PatientController(private val patientService: PatientService) {


}
