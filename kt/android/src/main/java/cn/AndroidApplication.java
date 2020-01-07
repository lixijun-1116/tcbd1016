package cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "cn.kgc.dao")
@SpringBootApplication
public class AndroidApplication {

    public static void main(String[] args) {
        SpringApplication.run(AndroidApplication.class, args);
    }

}
