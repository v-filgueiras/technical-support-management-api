package com.vfilgueiras.Residential_Technical_Support_Management_API.application.dto;

import com.vfilgueiras.Residential_Technical_Support_Management_API.domain.model.CustomerStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@AllArgsConstructor
@Builder
public class CustomerResponseDto {

    final private UUID id;
    final private String fullName;
    final private String cpf;
    final private String email;
    final private String phoneNumber;
    final private LocalDate birthDate;
    final private CustomerStatus status;
    final private LocalDateTime createdAt;
    final private LocalDateTime updatedAt;
    final private String addresses;
}
