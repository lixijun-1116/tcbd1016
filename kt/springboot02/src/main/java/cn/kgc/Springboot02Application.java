package cn.kgc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("cn.kgc.dao")
@SpringBootApplication
public class Springboot02Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot02Application.class, args);
    }

}
