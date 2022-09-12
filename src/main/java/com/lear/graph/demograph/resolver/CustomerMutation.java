package com.lear.graph.demograph.resolver;

import com.lear.graph.demograph.domain.Customers;
import com.lear.graph.demograph.model.CreateCustomerRequest;
import com.lear.graph.demograph.service.CustomersService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerMutation implements GraphQLMutationResolver {

    @Autowired
    private CustomersService customersService;

    public Customers createCustomers(CreateCustomerRequest createCustomerRequest){
        return customersService.createCustomers(createCustomerRequest);
    }

}
