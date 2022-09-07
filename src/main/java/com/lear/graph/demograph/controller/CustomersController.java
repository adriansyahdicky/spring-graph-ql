package com.lear.graph.demograph.controller;

import com.lear.graph.demograph.domain.Customers;
import com.lear.graph.demograph.service.CustomersService;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CustomersController {

    private final CustomersService customersService;

    public CustomersController(CustomersService customersService) {
        this.customersService = customersService;
    }

    @SchemaMapping(typeName = "Query",value = "customers")
    Iterable<Customers> getAll(){
        return customersService.getAll();
    }

//    @QueryMapping
//    public Customers getById(@Argument Integer id){
//        System.out.println("ID " + id);
//        return customersService.getById(id);
//    }
}
