package com.learn.springbasic.Spring1IoC;

public class Voderfone implements Sim{
    @Override
    public void calling() {
        System.out.println("Voderfone Calling");
    }

    @Override
    public void data() {
        System.out.println("Voderfone data");
    }
}
