package com.souravmodak.EmployeeManagementSystem.models;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

public class Employee {
    int id;

    @NotEmpty(message="Name is required")
    String name;

    String department;

    @Email(message = "Email must be valid")
    String email;

    @Positive(message = "Salary must be positive")
    double salary;

    public Employee(int id, String name, String department, String email, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.email = email;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public @NotEmpty(message = "Name is required") String getName() {
        return name;
    }

    public void setName(@NotEmpty(message = "Name is required") String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public @Email(message = "Email must be valid") String getEmail() {
        return email;
    }

    public void setEmail(@Email(message = "Email must be valid") String email) {
        this.email = email;
    }

    @Positive(message = "Salary must be positive")
    public double getSalary() {
        return salary;
    }

    public void setSalary(@Positive(message = "Salary must be positive") double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
