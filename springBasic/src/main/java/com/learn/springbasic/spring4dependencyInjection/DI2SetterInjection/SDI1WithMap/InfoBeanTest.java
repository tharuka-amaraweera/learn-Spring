package com.learn.springbasic.spring4dependencyInjection.DI2SetterInjection.SDI1WithMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InfoBeanTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("File5SDIWithSettersBeanConfiguration.xml");
        InfoBean infoBean = context.getBean("infoBean", InfoBean.class);
        infoBean.display();
    }
}
