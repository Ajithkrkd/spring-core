package com.ajith.springcore;

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
    	Student studentOne = new Student( 1,"ajith","8921187983");
    	
    	IstudentDao studentDao = new StudentDao();
    	studentDao.saveStudent(studentOne);
    	System.out.println("Student inserted successfully");
    }
}
