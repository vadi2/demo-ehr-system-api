package com.example.ehrsystemapi.service

import com.example.ehrsystemapi.model.Patient
import com.example.ehrsystemapi.repository.PatientRepository
import org.springframework.stereotype.Service
import org.springframework.data.repository.findByIdOrNull

@Service
class PatientService(private val patientRepository: PatientRepository) {


}
