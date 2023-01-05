package com.employee.Employee.Repo;

import com.employee.Employee.Bean.EmployeeBean;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepo extends MongoRepository<EmployeeBean,Integer> {
    public EmployeeBean findByName(String name);
    public EmployeeBean deleteByName(String name);
    public  EmployeeBean findById(int id);
}
