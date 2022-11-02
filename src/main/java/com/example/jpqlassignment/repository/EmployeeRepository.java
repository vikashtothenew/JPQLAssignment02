package com.example.jpqlassignment.repository;

import com.example.jpqlassignment.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
}
