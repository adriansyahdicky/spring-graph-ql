package com.lear.graph.demograph.service;

import com.lear.graph.demograph.domain.Customers;
import com.lear.graph.demograph.repository.CustomersRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class CustomersService {

    private final CustomersRepository customersRepository;

    public CustomersService(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    public Iterable<Customers> getAll(){
        return customersRepository.findAll();
    }

    public Customers getById(Integer id){
        Optional<Customers> optionalCustomers =
                customersRepository.findById(id);
        if(optionalCustomers.isEmpty()){
            return null;
        }
        System.out.println(optionalCustomers.get());
        return optionalCustomers.get();
    }
}
