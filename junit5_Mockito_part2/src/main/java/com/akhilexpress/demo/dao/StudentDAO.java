package com.akhilexpress.demo.dao;

import com.akhilexpress.demo.dto.Student;

public interface StudentDAO {
	
	int saveStudent(Student student); //1: student saved & 0: not saved 

}
