package com.jacob.test.conf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringConfig {


	
    public static void main(String[] args) {
        //AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("camel-context.xml");
    	AbstractApplicationContext ctx = 
                new AnnotationConfigApplicationContext(MyRouteConfiguration.class);
        ctx.start();
        System.out.println("Application context started");
        try {
            Thread.sleep(2 * 60 * 1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Application context stoped");
        ctx.stop();
        ctx.close();
    }
}
