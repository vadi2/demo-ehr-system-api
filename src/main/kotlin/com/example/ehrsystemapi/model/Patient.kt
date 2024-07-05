package com.example.ehrsystemapi.model

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "patients")
data class Patient(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    var name: String,

    @Column(nullable = false)
    var dateOfBirth: LocalDate,

    @Column(nullable = false)
    var gender: String,

    @Column(nullable = false)
    var phoneNumber: String,

    @Column(nullable = false)
    var email: String
)
