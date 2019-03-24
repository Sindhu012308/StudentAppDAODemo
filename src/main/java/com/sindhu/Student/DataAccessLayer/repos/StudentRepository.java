package com.sindhu.Student.DataAccessLayer.repos;

import org.springframework.data.repository.CrudRepository;

import com.sindhu.Student.DataAccessLayer.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}

// StudentRepository is data access layer. 
//it is power of spring data. 
//It replaces our DAO interfaces and DAO implementation.
//creates interface that extends the CRUD repository interface from spring data.