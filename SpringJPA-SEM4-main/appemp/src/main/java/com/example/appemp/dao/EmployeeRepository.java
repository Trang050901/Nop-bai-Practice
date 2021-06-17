package com.example.appemp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.example.appemp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

    // add a method to sort by last name
    public List<Employee> findAllByOrderByLastNameAsc();

}