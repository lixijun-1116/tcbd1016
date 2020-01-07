package cn.kgc.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("student")
public class Student {
    private Integer id;
    private String name;
    private Integer age;

}
