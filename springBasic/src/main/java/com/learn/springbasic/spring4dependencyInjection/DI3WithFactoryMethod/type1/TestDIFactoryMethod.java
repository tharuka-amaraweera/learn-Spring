package com.learn.springbasic.spring4dependencyInjection.DI3WithFactoryMethod.type1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDIFactoryMethod {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("File4DependencyInjectionFactory.xml");
        Geeks geek = context.getBean("geek", Geeks.class);
        geek.geeksMessage();
    }
}
