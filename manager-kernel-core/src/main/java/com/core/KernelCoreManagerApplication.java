package com.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan
@EnableJpaRepositories(basePackages = "com.core.repository")
@EntityScan
@EnableAutoConfiguration
@EnableEurekaClient
public class KernelCoreManagerApplication {
        
	public static void main(String[] args) {
            System.out.print( ":::: Kernel Core Manager ----> run success !!! :::::");
		SpringApplication.run(KernelCoreManagerApplication.class, args);
	}

}
