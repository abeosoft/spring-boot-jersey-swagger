package com.reepay.sample.jersey;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.wordnik.swagger.config.ConfigFactory;
import com.wordnik.swagger.config.ScannerFactory;
import com.wordnik.swagger.config.SwaggerConfig;
import com.wordnik.swagger.jaxrs.config.DefaultJaxrsScanner;
import com.wordnik.swagger.jersey.JerseyApiReader;
import com.wordnik.swagger.reader.ClassReaders;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application implements CommandLineRunner {
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception {
        SwaggerConfig config = ConfigFactory.config();
        config.setBasePath("http://localhost:8080/api-docs");
        config.setApiVersion("1.0.0");
        ScannerFactory.setScanner(new DefaultJaxrsScanner());
        ClassReaders.setReader(new JerseyApiReader());
    }

}
