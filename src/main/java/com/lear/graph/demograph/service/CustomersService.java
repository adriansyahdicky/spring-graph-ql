package com.lear.graph.demograph.service;

import com.lear.graph.demograph.domain.Customers;
import com.lear.graph.demograph.exception.DataNotFoundException;
import com.lear.graph.demograph.model.CreateCustomerRequest;
import com.lear.graph.demograph.repository.CustomersRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class CustomersService {

    private final CustomersRepository customersRepository;

    public CustomersService(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    public Iterable<Customers> getCustomers(){
        return customersRepository.findAll();
    }

    public Customers getById(Integer id){
        Optional<Customers> optionalCustomers =
                customersRepository.findById(id);
        if(optionalCustomers.isEmpty()){
            throw  new DataNotFoundException("Data Customer Not Found ", "With ID " + id);
        }
        return optionalCustomers.get();
    }

    public Customers createCustomers(CreateCustomerRequest createCustomerRequest){
        Customers customers =
                Customers.builder()
                        .id(createCustomerRequest.getId())
                        .name(createCustomerRequest.getName())
                        .address(createCustomerRequest.getAddress())
                        .mobilePhone(createCustomerRequest.getMobilePhone())
                        .isActivated(createCustomerRequest.getIsActivated())
                        .build();
        return customersRepository.save(customers);
    }
}
