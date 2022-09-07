package com.lear.graph.demograph.repository;

import com.lear.graph.demograph.domain.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer> {
}
