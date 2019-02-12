package com.manzyk.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manzyk.app.domain.Student;

import java.util.BitSet;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
