package com.prabu.EmployeeServiceModule;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>

{

}
