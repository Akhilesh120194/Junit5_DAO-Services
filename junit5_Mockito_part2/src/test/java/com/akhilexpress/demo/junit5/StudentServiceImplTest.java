package com.akhilexpress.demo.junit5;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.akhilexpress.demo.dao.StudentDAO;
import com.akhilexpress.demo.dto.Student;
import com.akhilexpress.demo.service.StudentServicempl;


@ExtendWith(MockitoExtension.class)
class StudentServiceImplTest {

	@InjectMocks
	StudentServicempl studentServicempl; //It will inject 
	
	
	
	@Mock
	StudentDAO studentDAO;
	
	@BeforeEach
	public void setUp()
	{
	//	studentServicempl=new StudentServicempl();
	//	studentServicempl.setStudentDAO(studentDAO);
	}
	
	@Test
	void enrollStudent_test()
	{
		Student student=new Student(1, "Akhilesh", "india");
		when(studentDAO.saveStudent(student)).thenReturn(1);
		boolean enrollStudent = studentServicempl.enrollStudent(student);
		System.out.println(enrollStudent);
	}

}
