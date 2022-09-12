package com.lear.graph.demograph.resolver;

import com.lear.graph.demograph.domain.Customers;
import com.lear.graph.demograph.service.CustomersService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CustomerQuery implements GraphQLQueryResolver {

    @Autowired
    private CustomersService customersService;

    public Iterable<Customers> getCustomers(){
        return customersService.getCustomers();
    }

    public Customers findCustomerById(int id){
        return customersService.getById(id);
    }

}
