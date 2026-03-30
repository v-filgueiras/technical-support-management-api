package com.vfilgueiras.Residential_Technical_Support_Management_API.technician.application.mapper;

import com.vfilgueiras.Residential_Technical_Support_Management_API.technician.application.dto.TechnicianRequestDto;
import com.vfilgueiras.Residential_Technical_Support_Management_API.technician.application.dto.TechnicianResponseDto;
import com.vfilgueiras.Residential_Technical_Support_Management_API.technician.domain.entity.TechnicianEntity;
import org.springframework.stereotype.Component;

@Component
public class TechnicianMapper {

    public TechnicianEntity toEntity(TechnicianRequestDto dto) {

        return  TechnicianEntity
                .builder()
                .fullName(dto.getFullName())
                .cpf(dto.getCpf())
                .email(dto.getEmail())
                .phoneNumber(dto.getPhoneNumber())
                .status(dto.getStatus())
                .build();

    }

    public TechnicianResponseDto toDto(TechnicianEntity technician) {
        return new TechnicianResponseDto(
                technician.getId(),
                technician.getFullName(),
                technician.getCpf(),
                technician.getEmail(),
                technician.getPhoneNumber(),
                technician.getHireDate(),
                technician.getStatus(),
                technician.getCreatedAt(),
                technician.getUpdatedAt()
        );
    }

}
