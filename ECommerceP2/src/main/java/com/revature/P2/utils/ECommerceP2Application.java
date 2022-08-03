package com.revature.P2.utils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EntityScan
@EnableTransactionManagement
@EnableJpaRepositories
@EnableJpaAuditing
@SpringBootApplication
public class ECommerceP2Application {

    public static void main(String[] args) {
        SpringApplication.run(ECommerceP2Application.class, args);
    }
}