package com.ajith.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ajith.springcore.homeServices.AjithHome;
import com.ajith.springcore.sims.Airtel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");
    	System.out.println("application loaded");
    	AjithHome home = context.getBean("ajithHome",AjithHome.class);
    	home.iNeedService();
    }
}
