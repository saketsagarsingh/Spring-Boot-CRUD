package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	//which has incomplete implementation 
	//used as blueprint like vehicle is interface and car is it's implementation
}
