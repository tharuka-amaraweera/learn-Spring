package com.learn.springbasic.spring5Bean.LifeCycle.methodTwo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class HelloWorld {
    private String description;

    public HelloWorld(String description){
        this.description = description;
    }

    public String whatAboutWorld(){
        return  this.description;
    }
    @PostConstruct
    public void initial(){
        System.out.println(
                "Bean HelloWorld has been "
                        + "instantiated and I'm "
                        + "the init() method");
    }

    @PreDestroy
    public void destroyIt(){
        System.out.println(
                "Container has been closed "
                        + "and I'm the destroy() method");
    }
}
