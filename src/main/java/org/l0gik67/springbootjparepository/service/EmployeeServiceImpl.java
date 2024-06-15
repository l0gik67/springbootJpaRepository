package org.l0gik67.springbootjparepository.service;


import org.l0gik67.springbootjparepository.entity.Employee;
import org.l0gik67.springbootjparepository.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }



    @Override
    public Employee getEmployee(int id){
        Optional<Employee> optional = employeeRepository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    @Override
    public void deleteEmployee(int id){
        employeeRepository.deleteById(id);
    }
}
