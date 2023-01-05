package com.employee.Employee.Controller;

import com.employee.Employee.Bean.EmployeeBean;
import com.employee.Employee.Service.EmployeeService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    Logger logger = LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/addEmployee")
    public EmployeeBean addEmployee(@Valid @RequestBody EmployeeBean emp){
      return  employeeService.addEmployee(emp);
    }
    @PutMapping("/updateEmployee/{id}")
    public EmployeeBean updateEmployee(@PathVariable("id") int id, @RequestBody EmployeeBean emp){
        return  employeeService.updateEmployeeById(emp);
    }
    @GetMapping("/getEmployeeByName/{name}")
    public  EmployeeBean getEmployee(@PathVariable("name") String name){
        return employeeService.getEmployeeByName(name);
    }
    @DeleteMapping("/deleteEmployeeByName/{name}")
    public void  deleteEmployee(@PathVariable ("name") String name)
    {
        employeeService.deleteEmployeeByName(name);
    }
    @GetMapping("getEmployeeById/{id}")
    public  EmployeeBean getEmployeeById(@PathVariable ("id") int id){
        return  employeeService.getEmployeeById(id);
    }
}
