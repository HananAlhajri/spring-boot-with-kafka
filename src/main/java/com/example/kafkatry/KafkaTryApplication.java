package com.example.kafkatry;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaTryApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaTryApplication.class, args);
	}

	//to try
	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
		return args -> {
			for(int i=0; i < 100; i++) {
				kafkaTemplate.send("hanan", "Hello Kafka :) ##" + i);
			}
		};
	}

}
