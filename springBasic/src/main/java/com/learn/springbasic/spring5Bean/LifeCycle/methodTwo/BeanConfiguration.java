package com.learn.springbasic.spring5Bean.LifeCycle.methodTwo;

import com.learn.springbasic.spring5Bean.LifeCycle.methodOne.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public HelloWorld helloWorld() {
        return  new HelloWorld("Bean Configuration with Configuration class and want see the lifecycle");
    }
}
