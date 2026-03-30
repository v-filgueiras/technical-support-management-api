package com.vfilgueiras.Residential_Technical_Support_Management_API.technician.application.dto;

import com.vfilgueiras.Residential_Technical_Support_Management_API.technician.domain.model.TechnicianStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@AllArgsConstructor
@Builder
public class TechnicianResponseDto {

    private UUID id;
    private String fullName;
    private String cpf;
    private String email;
    private String phoneNumber;
    private LocalDate hireDate;
    private TechnicianStatus status;
    final private boolean active = true;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
