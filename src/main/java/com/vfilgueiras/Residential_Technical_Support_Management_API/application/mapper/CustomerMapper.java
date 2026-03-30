package com.vfilgueiras.Residential_Technical_Support_Management_API.application.mapper;

import com.vfilgueiras.Residential_Technical_Support_Management_API.application.dto.CustomerRequestDto;
import com.vfilgueiras.Residential_Technical_Support_Management_API.application.dto.CustomerResponseDto;
import com.vfilgueiras.Residential_Technical_Support_Management_API.domain.entity.CustomerEntity;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public CustomerEntity toEntity(CustomerRequestDto dto) {

        return CustomerEntity
                .builder()
                .fullName(dto.getFullName())
                .cpf(dto.getCpf())
                .email(dto.getEmail())
                .phoneNumber(dto.getPhoneNumber())
                .birthDate(dto.getBirthDate())
                .status(dto.getStatus())
                .addresses(dto.getAddresses())
                .build();
    }

    public CustomerResponseDto toDto(CustomerEntity customer) {

        return new CustomerResponseDto(
                customer.getId(),
                customer.getFullName(),
                customer.getCpf(),
                customer.getEmail(),
                customer.getPhoneNumber(),
                customer.getBirthDate(),
                customer.getStatus(),
                customer.getCreatedAt(),
                customer.getUpdatedAt(),
                customer.getAddresses()
                );
    }
}
