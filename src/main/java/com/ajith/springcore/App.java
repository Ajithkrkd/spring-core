package com.ajith.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ajith.springcore.SchoolManagement.IstudentDao;
import com.ajith.springcore.SchoolManagement.Student;
import com.ajith.springcore.SchoolManagement.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
    	
    	Student studentOne = new Student( 3,"meenakshi","9099909090");
    	
    	
    	
    	studentDao.saveStudent(studentOne);
    	
    	System.out.println("Student inserted successfully");
    }
}
