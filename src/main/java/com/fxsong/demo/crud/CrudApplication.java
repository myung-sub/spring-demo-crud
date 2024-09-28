package com.fxsong.demo.crud;

import com.fxsong.demo.crud.repository.MemberRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(CrudApplication.class);
        app.run(args);
    }

    @Bean
    ApplicationRunner demo(MemberRepository repository) {
        return args -> repository.findAll().forEach(System.out::println);
    }

}

