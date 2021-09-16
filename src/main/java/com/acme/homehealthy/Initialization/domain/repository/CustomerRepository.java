package com.acme.homehealthy.Initialization.domain.repository;

import com.acme.homehealthy.Initialization.domain.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Optional<Customer> findCustomerByEmail(String email);
    Optional<Customer> findCustomerByUsername(String username);
    Optional<Customer> findCustomerByUsernameAndPassword(String username, String password);
}
