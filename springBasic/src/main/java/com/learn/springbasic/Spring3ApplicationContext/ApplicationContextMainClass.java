package com.learn.springbasic.Spring3ApplicationContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ApplicationContextMainClass {
    public static void main(String[] args) {
        /**
         * Using ClassPathXmlApplicationContext
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("File3ApplicationContextConfiguration.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);

        /**
         * Using SpringApplication.run()
         */
        ApplicationContext context = SpringApplication.run(ApplicationContextMainClass.class,args);
        Student student1 = context.getBean("student", Student.class);
        System.out.println(student1);

        Student student2 = context.getBean("student2", Student.class);
        System.out.println(student2);


    }
}
