package com.employee.Employee.Bean;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@AllArgsConstructor(staticName = "bulid")
//@AllArgsConstructor
@NoArgsConstructor
@Document(value="Employee")
public class EmployeeBean {
    @NotNull(message = "id shouldn't be null")
    @Id
    private int id;
    @NotNull(message = "name shouldn't be null")
    private String name;
    @Min(value = 18,message = "age should have minimum 18")
    @Max(value = 60,message = "age should have minimum 60")
    private int  age;
//    @Pattern(regexp = "^\\d{10}$",message = "number should have 10 digits")
    private long contactNumber;
    @Email(message = "Please enter valid email")
    private String email;
    @NotNull(message = "city shouldn't be null")
    private String city;

    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", contactNumber=" + contactNumber +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                '}';
    }
}
