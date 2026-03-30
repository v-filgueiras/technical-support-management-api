package com.vfilgueiras.Residential_Technical_Support_Management_API.infrastructure.controller;

import com.vfilgueiras.Residential_Technical_Support_Management_API.application.dto.CustomerRequestDto;
import com.vfilgueiras.Residential_Technical_Support_Management_API.application.dto.CustomerResponseDto;
import com.vfilgueiras.Residential_Technical_Support_Management_API.application.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    final private CustomerService customerService;

    @PostMapping
    public ResponseEntity<CustomerResponseDto> create(@RequestBody CustomerRequestDto dto) {
        CustomerResponseDto customer = customerService.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(customer);
    }
}
