package com.vfilgueiras.Residential_Technical_Support_Management_API.application.service;

import com.vfilgueiras.Residential_Technical_Support_Management_API.application.dto.CustomerRequestDto;
import com.vfilgueiras.Residential_Technical_Support_Management_API.application.dto.CustomerResponseDto;
import com.vfilgueiras.Residential_Technical_Support_Management_API.application.mapper.CustomerMapper;
import com.vfilgueiras.Residential_Technical_Support_Management_API.domain.entity.CustomerEntity;
import com.vfilgueiras.Residential_Technical_Support_Management_API.domain.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

     final private CustomerMapper customerMapper;
     final private CustomerRepository customerRepository;

    public CustomerResponseDto create(CustomerRequestDto dto) {

        CustomerEntity customer = customerMapper.toEntity(dto);
        CustomerEntity customerSaved = customerRepository.save(customer);
        return customerMapper.toDto(customerSaved);
    }

}
