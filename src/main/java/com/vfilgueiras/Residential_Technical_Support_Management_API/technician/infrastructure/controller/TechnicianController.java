package com.vfilgueiras.Residential_Technical_Support_Management_API.technician.infrastructure.controller;

import com.vfilgueiras.Residential_Technical_Support_Management_API.technician.application.dto.TechnicianRequestDto;
import com.vfilgueiras.Residential_Technical_Support_Management_API.technician.application.dto.TechnicianResponseDto;
import com.vfilgueiras.Residential_Technical_Support_Management_API.technician.application.service.TechnicianService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/technicians")
@RequiredArgsConstructor
public class TechnicianController {

    private final TechnicianService technicianService;

    @PostMapping
    public ResponseEntity<TechnicianResponseDto> create(@RequestBody @Valid TechnicianRequestDto dto) {

        TechnicianResponseDto technician = technicianService.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(technician);
    }

    @GetMapping("/{technicianId}")
    public ResponseEntity<TechnicianResponseDto> findById(@PathVariable UUID technicianId) {

        TechnicianResponseDto technician = technicianService.findTechnicianById(technicianId);
        return ResponseEntity.ok().body(technician);
    }

    @PutMapping("/{technicianId}")
    public ResponseEntity<TechnicianResponseDto> updateTechnician(
            @PathVariable UUID technicianId, @RequestBody TechnicianRequestDto dto) {

        TechnicianResponseDto technician = technicianService.updateTechnician(technicianId, dto);
        return ResponseEntity.ok().body(technician);
    }

    @DeleteMapping("/{technicianId}")
    public ResponseEntity<TechnicianResponseDto> deleteTechnician(@PathVariable UUID technicianId) {
        TechnicianResponseDto technician = technicianService.deleteTechnician(technicianId);
        return ResponseEntity.ok().body(technician);
    }
}
