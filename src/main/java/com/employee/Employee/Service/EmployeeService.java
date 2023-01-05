package com.employee.Employee.Service;

import com.employee.Employee.Bean.EmployeeBean;
import com.employee.Employee.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;
    /*public List<EmployeeBean> addEmployee(){
        return EmployeeBean;
    }*/

    public EmployeeBean addEmployee(EmployeeBean emp){

        return employeeRepo.save(emp);
    }
    public  EmployeeBean updateEmployeeById(EmployeeBean emp){
//        System.out.println(employeeRepo.save(emp));
        return employeeRepo.save(emp);
    }
    public  EmployeeBean getEmployeeByName(String name){

        return employeeRepo.findByName(name);
    }
    public  void deleteEmployeeByName(String name){

        employeeRepo.deleteByName(name);
    }
    public EmployeeBean getEmployeeById(int id){

        EmployeeBean employee=employeeRepo.findById(id);
        if (employee==null){
            throw  new  NullPointerException();
        }
        else {
            return  employee;
        }

    }
}
