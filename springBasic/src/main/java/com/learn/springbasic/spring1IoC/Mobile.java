package com.learn.springbasic.spring1IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        /*Sim sim = new Airtel();

        sim.calling();
        sim.data();*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beansConfiguration.xml");
        Sim sim = applicationContext.getBean("mob", Sim.class);
        sim.data();
        sim.calling();
    }
}
