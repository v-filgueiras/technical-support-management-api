package com.vfilgueiras.Residential_Technical_Support_Management_API.application.dto;

import com.vfilgueiras.Residential_Technical_Support_Management_API.domain.model.CustomerStatus;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class CustomerRequestDto {

    @NotBlank(message = "Full name must not be blank")
    @Size(max = 150, message = "Full name must not exceed 150 characters")
    private final String fullName;

    @NotBlank(message = "CPF must not be blank")
    @Size(min = 11, max = 11, message = "CPF must contain exactly 11 characters")
    private final String cpf;

    @NotBlank(message = "Email must not be blank")
    @Email(message = "Email must be valid")
    @Size(max = 150, message = "Email must not exceed 150 characters")
    private final String email;

    @NotBlank(message = "Phone number must not be blank")
    @Size(min = 10, max = 15, message = "Phone number must be between 10 and 15 characters")
    private final String phoneNumber;

    @NotNull(message = "Birth date must not be null")
    @Past(message = "Birth date must be in the past")
    private final LocalDate birthDate;

    @NotNull(message = "Status must not be null")
    private final CustomerStatus status;

    @NotBlank(message = "Address must not be blank")
    @Size(max = 255, message = "Address must not exceed 255 characters")
    private final String addresses;
}