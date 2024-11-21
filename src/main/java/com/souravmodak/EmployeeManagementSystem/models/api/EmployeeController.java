package com.souravmodak.EmployeeManagementSystem.models.api;

import com.souravmodak.EmployeeManagementSystem.models.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    private List<Employee> employeeList = new ArrayList<>();

    @GetMapping("/")
    public String homePage(Model model){
        return "home";
    }
}
