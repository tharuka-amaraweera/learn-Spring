package com.learn.springbasic.Spring2BeanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryDemo {
    public static void main(String[] args) {
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-factory-demo.xml");
        //Student student = applicationContext.getBean("student", Student.class);
        //student.toString();

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("bean-factory-demo.xml");
        Student student = beanFactory.getBean("studentTwo", Student.class);
        System.out.println(student);
    }
}
