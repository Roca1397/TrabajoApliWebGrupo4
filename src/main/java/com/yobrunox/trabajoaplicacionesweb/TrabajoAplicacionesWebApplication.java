package com.yobrunox.trabajoaplicacionesweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication (exclude = {SecurityAutoConfiguration.class})
public class TrabajoAplicacionesWebApplication {

    public static void main(String[] args) {SpringApplication.run(TrabajoAplicacionesWebApplication.class, args);}

}
