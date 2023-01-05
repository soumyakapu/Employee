package com.employee.Employee.Bean;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;

@Data
@AllArgsConstructor(staticName = "bulid")
/*@AllArgsConstructor*/
@NoArgsConstructor
public class EmployeeDetails {
    @NotNull(message = "id shouldn't be null")
    private int id;
    @NotNull(message = "name shouldn't be null")
    private String name;
   @Min(value = 18,message = "age should have minimum 18")
   @Max(value = 60,message = "age should have minimum 60")
    private int  age;
    @Pattern(regexp = "^\\d{10}$",message = "number should have 10 digits")
    private long contactNumber;
    @Email(message = "Please enter valid email")
    private String email;
    @NotNull(message = "city shouldn't be null")
    private String city;
    @NotEmpty
    private double salary;
}
