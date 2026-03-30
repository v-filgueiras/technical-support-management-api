package com.vfilgueiras.Residential_Technical_Support_Management_API.technician.application.dto;

import com.vfilgueiras.Residential_Technical_Support_Management_API.technician.domain.model.TechnicianStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TechnicianRequestDto {

    @Size(max = 150, message = "Full name must not exceed 150 characters")
    @NotBlank(message = "Full name must not be blank")
    final private String fullName;

    @Size(min = 11, max = 11, message = "CPF must contain exactly 11 characters")
    @NotBlank(message = "CPF must not be blank")
    final private String cpf;

    @Size(max = 250, message = "Email must not exceed 250 characters")
    @NotBlank(message = "Email must not be blank")
    final private String email;

    @Size(min = 11, max = 11, message = "Phone must not exceed 11 characters")
    @NotBlank(message = "Phone must not be blank")
    final private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "technician_status", nullable = false)
    final private TechnicianStatus status;
}
