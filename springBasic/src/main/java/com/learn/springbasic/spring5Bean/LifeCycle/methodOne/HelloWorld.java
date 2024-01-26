package com.learn.springbasic.spring5Bean.LifeCycle.methodOne;

public class HelloWorld {
    private String description;

    public HelloWorld(String description){
        this.description = description;
    }

    public String whatAboutWorld(){
        return  this.description;
    }
    public void init(){
        System.out.println(
                "Bean HelloWorld has been "
                        + "instantiated and I'm "
                        + "the init() method");
    }

    public void destroy(){
        System.out.println(
                "Container has been closed "
                        + "and I'm the destroy() method");
    }
}
