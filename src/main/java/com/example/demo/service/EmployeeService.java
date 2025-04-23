package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAllEmployees() {
    	//GET method
        return repository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
    	//GET method but fetches a single record
        return repository.findById(id);
    }

    public Employee saveEmployee(Employee employee) {
    	//POST method
        return repository.save(employee);
    }

    public void deleteEmployee(Long id) {
    	//DELETE method
        repository.deleteById(id);
    }

    public Employee updateEmployee(Long id, Employee updatedEmployee) {
    	//PUT method
        return repository.findById(id).map(employee -> {
            employee.setName(updatedEmployee.getName());
            employee.setEmail(updatedEmployee.getEmail());
            employee.setDepartment(updatedEmployee.getDepartment());
            return repository.save(employee);
        }).orElse(null);
    }
}
