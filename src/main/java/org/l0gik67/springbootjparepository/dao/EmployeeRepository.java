package org.l0gik67.springbootjparepository.dao;

import org.l0gik67.springbootjparepository.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
