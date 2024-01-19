package com.learn.springbasic.spring4dependencyInjection.DI2SetterInjection.SDI1WithMap;

import java.util.Map;

public class InfoBean {
    private String name;
    private String msg;
    private Map<String,String> framework;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, String> getFramework() {
        return framework;
    }

    public void setFramework(Map<String, String> framework) {
        this.framework = framework;
    }

    public void display(){
        System.out.println("My name is: "+name);
        System.out.println("and my message is: "+msg);
        System.out.println("Framework Name : Description");
        framework.forEach((key,value) -> {
            System.out.println(key+" : "+value);
        });

    }
}
