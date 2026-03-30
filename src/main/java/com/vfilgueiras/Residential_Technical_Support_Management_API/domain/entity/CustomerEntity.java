package com.vfilgueiras.Residential_Technical_Support_Management_API.domain.entity;

import com.vfilgueiras.Residential_Technical_Support_Management_API.domain.model.CustomerStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "costumer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "costumer_id")
    private UUID id;

    @Size(max = 150, message = "Full name must not exceed 150 characters")
    @NotBlank(message = "Full name must not be blank")
    @Column(name = "full_name", length = 150, nullable = false)
    private String fullName;

    @Size(min = 11, max = 11, message = "CPF must not exceed 11 characters")
    @NotBlank(message = "CPF must not be blank")
    @Column(name = "cpf", length = 11, nullable = false)
    private String cpf;

    @Size(max = 250, message = "Email must not exceed 250 characters")
    @NotBlank(message = "Email must not be blank")
    @Column(name = "email", length = 250, nullable = false)
    private String email;

    @Size(min = 11, max = 11, message = "Phone number must not exceed 11 characters")
    @NotBlank(message = "Phone number must not be blank")
    @Column(name = "phone_number", length = 11, nullable = false)
    private String phoneNumber;

    @NotNull(message = "Birth date must not be null")
    private LocalDate birthDate;

    @NotNull(message = "Customer status must not be null")
    @Enumerated(EnumType.STRING)
    private CustomerStatus status;

    @NotNull(message = "Created date must not be null")
    private LocalDateTime createdAt;

    @NotNull(message = "Updated date must not be null")
    private LocalDateTime updatedAt;

    @Size(max = 1000, message = "Address must not exceed 1000 characters")
    @NotBlank(message = "Address must not be blank")
    @Column(name = "addresses", length = 1000, nullable = false)
    private String addresses;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

    @Builder
    public CustomerEntity(String fullName, String cpf, String email, String phoneNumber,
                          LocalDate birthDate, CustomerStatus status, String addresses) {

        this.fullName = fullName;
        this.cpf = cpf;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.status = status;
        this.addresses = addresses;
    }
}