package com.akhilexpress.demo.service;

import com.akhilexpress.demo.dao.StudentDAO;
import com.akhilexpress.demo.dto.Student;

public class StudentServicempl implements StudentService {

	private StudentDAO studentDAO;
	
	@Override
	public boolean enrollStudent(Student student) {
		int saveStudent = getStudentDAO().saveStudent(student);
		
		if(saveStudent==1)
		{
			System.out.println("Sending an enrollment email");
			return true ;
		}
		
		return false;
	}

	public StudentDAO getStudentDAO() {
		return studentDAO;
	}

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}



}
