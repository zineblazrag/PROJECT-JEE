package org.sid.customerservice.repository;

import org.sid.customerservice.CustomerServiceApplication;
import org.sid.customerservice.entites.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

@SpringBootApplication
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
