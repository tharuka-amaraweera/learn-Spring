package com.learn.springbasic.spring4dependencyInjection.DI1constructorInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class findCheatedStudent {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("File4DependencyInjection.xml");
        Student student = context.getBean("student", Student.class);
        student.cheating();
    }
}
