package com.bridgelabz.springbootexample.repository;

import com.bridgelabz.springbootexample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    List<Employee> findByEmpName(String name);

    @Query(value = "select e.* from emp_data e join address_data a on e.emp_id = a.employee_id where a.city = :cityName",nativeQuery = true)
    List<Employee> findEmployeesByCity(String cityName);
}
