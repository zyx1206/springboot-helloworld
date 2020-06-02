package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MySpringBootApplication {
    public static void main(String[] args){
        //启动tomcat服务器
        ApplicationContext act = SpringApplication.run(MySpringBootApplication.class, args);
        for (String name : act.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }
}
