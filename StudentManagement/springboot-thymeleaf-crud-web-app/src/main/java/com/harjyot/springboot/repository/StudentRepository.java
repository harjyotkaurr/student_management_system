package com.harjyot.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harjyot.springboot.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}
