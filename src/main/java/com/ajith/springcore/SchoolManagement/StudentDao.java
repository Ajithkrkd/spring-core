package com.ajith.springcore.SchoolManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao implements IstudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String INSERTSTUDENT = "INSERT INTO Student VALUES (?,?,?)";
	
	@Override
	public void saveStudent(Student student) {
		
		Object [] arg = {student.getRoleNo(),student.getStudentName(),student.getPhoneNumber()};
		
		
		jdbcTemplate.update(INSERTSTUDENT, arg);
	}
	
	
	
	
	
	
}
