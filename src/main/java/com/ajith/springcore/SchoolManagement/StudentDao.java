package com.ajith.springcore.SchoolManagement;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class StudentDao implements IstudentDao {

	private JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
	
	
	
	
	
	
	private static final String INSERTSTUDENT = "INSERT INTO Student VALUES (?,?,?)";
	
	@Override
	public void saveStudent(Student student) {
		
		Object [] arg = {student.getRoleNo(),student.getStudentName(),student.getPhoneNumber()};
		
		
		jdbcTemplate.update(INSERTSTUDENT, arg);
	}
	
	
	
	private DataSource getDataSource() {
		String url ="jdbc:mysql://localhost:3309/School";
		String username = "root";
		String password = "password#2#2";
		DataSource dataSource = new DriverManagerDataSource(url,username,password);
		return dataSource;
	}
	
	
}
