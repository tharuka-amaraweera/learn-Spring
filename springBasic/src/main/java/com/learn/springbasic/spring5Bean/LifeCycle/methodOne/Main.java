package com.learn.springbasic.spring5Bean.LifeCycle.methodOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("bean/beanLifeCycleConfiguration.xml");
        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
        System.out.println(helloWorld.whatAboutWorld());
        context.close();


    }
}
