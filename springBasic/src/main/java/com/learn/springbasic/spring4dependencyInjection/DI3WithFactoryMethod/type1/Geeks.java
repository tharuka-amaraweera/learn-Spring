package com.learn.springbasic.spring4dependencyInjection.DI3WithFactoryMethod.type1;

public class Geeks {

    public static final Geeks geeks = new Geeks();

    private Geeks(){}

    public static Geeks getGeeks(){
        return geeks;
    }

    // this method is used to check the dependency injection
    public void geeksMessage() {
        System.out.println("Welcome to geeksforgeeks. DI for static factory method working good");
    }

}
