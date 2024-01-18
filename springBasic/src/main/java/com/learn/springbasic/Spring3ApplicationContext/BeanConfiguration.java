package com.learn.springbasic.Spring3ApplicationContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public Student student(){
        return  new Student("Dashanka",33);
    }

    @Bean
    public Student student2(){
        return  new Student("Vimukthi",23);
    }
}
