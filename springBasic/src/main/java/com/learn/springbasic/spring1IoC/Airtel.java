package com.learn.springbasic.spring1IoC;

public class Airtel implements Sim{
    @Override
    public void calling() {
        System.out.println("Airtel Calling");
    }

    @Override
    public void data() {
        System.out.println("Airtel Data");
    }
}
