package com.rakesh;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.rakesh.component")
@EntityScan(basePackages = {"com.rakesh.modal"})
@EnableJpaRepositories(basePackages ={"com.rakesh.repository"})
public class JpaDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);

	}
}
