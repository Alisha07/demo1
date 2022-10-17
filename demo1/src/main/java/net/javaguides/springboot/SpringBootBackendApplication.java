package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan( basePackages = {"it.uniroma3.siw.model"})
@ComponentScan(basePackages = {"EmployeeController.class"})
public class SpringBootBackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootBackendApplication.class, args);
	}

}
