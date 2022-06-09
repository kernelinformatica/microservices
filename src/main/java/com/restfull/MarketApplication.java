package com.restfull;


import java.io.IOException;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class MarketApplication extends SpringBootServletInitializer {
        public static void main(String[] args) {
            System.out.print( ":::: Micro Service Dinamic Market run success !!! :::::");
            	SpringApplication.run(MarketApplication.class, args);
	}
        
       
        

}
