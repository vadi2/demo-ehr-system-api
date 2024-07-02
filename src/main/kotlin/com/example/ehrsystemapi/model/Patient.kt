package com.example.ehrsystemapi.model

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "patients")
data class Patient(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,


)
