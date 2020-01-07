package cn.kgc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("cn.kgc.dao")
@SpringBootApplication
public class FreemarkerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreemarkerApplication.class, args);
    }

}
