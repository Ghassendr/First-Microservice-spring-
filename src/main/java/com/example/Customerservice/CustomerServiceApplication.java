package com.example.Customerservice;

import com.example.Customerservice.Repository.CustomerRepository;
import com.example.Customerservice.entity.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start (CustomerRepository customerRepository){
		return args -> {

			customerRepository.save(new Customer(null ,"iset","iset@gmail.com"));
			customerRepository.save(new Customer(null ,"ensi","ensi@gmail.com"));
			customerRepository.save(new Customer(null ,"insat","insat@gmail.com"));
			customerRepository.findAll().forEach(System.out::println);
		};
	}

}
