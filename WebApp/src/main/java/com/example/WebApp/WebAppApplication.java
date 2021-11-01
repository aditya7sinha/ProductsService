package com.example.WebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import com.example.WebApp.model.Product;


@SpringBootApplication
public class WebAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebAppApplication.class, args);

    }

}
