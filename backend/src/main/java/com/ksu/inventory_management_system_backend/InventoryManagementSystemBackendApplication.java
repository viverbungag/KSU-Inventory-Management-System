package com.ksu.inventory_management_system_backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class InventoryManagementSystemBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryManagementSystemBackendApplication.class, args);
	}

}
