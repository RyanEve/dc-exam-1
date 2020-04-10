package com.igw.exm;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
@MapperScan(basePackages = {"com.igw.exm.givebatch.infrastructure.dao.*"})
@ComponentScan(basePackages = {"com.igw.exm"})
public class ExamBootstrapApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExamBootstrapApplication.class, args);
    }
}
