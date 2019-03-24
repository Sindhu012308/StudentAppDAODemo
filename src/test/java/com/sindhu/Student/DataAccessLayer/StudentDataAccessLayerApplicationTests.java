package com.sindhu.Student.DataAccessLayer;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sindhu.Student.DataAccessLayer.entities.Student;
import com.sindhu.Student.DataAccessLayer.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDataAccessLayerApplicationTests {
	
	@Autowired
	private StudentRepository studentRepository;
	
	//test case for creating a row i.e., inserting
	@Test
	public void testCreateStudent() {
	
		Student student = new Student();
		student.setName("John");
		student.setCourse("Java web");
		student.setFee(30d);
		
	
		student.setName("Sindhu Mental");
		student.setCourse("Java web");
		student.setFee(40d);
		
		student.setName("Gopal");
		student.setCourse("Java");
		student.setFee(50d);

		student.setName("johnson");
		student.setCourse("angular");
		student.setFee(10d);
		studentRepository.save(student);
	}
	
	// test case for selecting a row based on studentId
	@Test
	public void testFindStudentById() { 
		//Optional<Student> student = studentRepository.findById(2l);
		Student student = studentRepository.findById(3l).get();
		System.out.println(student);
	}
	
	//test case for updating a row
	@Test
	public void testUpdateStudent() { 
		//Optional<Student> student = studentRepository.findById(3l);
		Student student = studentRepository.findById(3l).get();
		student.setFee(70d);
		
		studentRepository.save(student);
	}
	
	// Test case for deleting a row
	@Test
	public void testDeleteStudent() { 
		/*Student student = new Student();
		student.setId(1l);
		studentRepository.delete(student);
		*/
		studentRepository.deleteById(4l);
	}
}



