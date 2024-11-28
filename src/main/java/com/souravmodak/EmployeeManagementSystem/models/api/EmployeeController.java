package com.souravmodak.EmployeeManagementSystem.models.api;

import com.souravmodak.EmployeeManagementSystem.models.Employee;
import org.springframework.boot.Banner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("employees")
public class EmployeeController {

    private List<Employee> employeeList;

    public EmployeeController()
    {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Tisha", "HR", "tisha@gmail.com", 50000));
        employeeList.add(new Employee(2, "Sourav", "Engineering", "bob@gmail.com", 60000));
        employeeList.add(new Employee(3, "Bhavdeep", "Finance", "charlie@gmail.com", 55000));
    }

    @GetMapping("/")
    public String homePage(Model model){

        model.addAttribute("employees", employeeList);
        return "list-employees";
    }

    @GetMapping("add")
    public String showAddEmployeePage(Model model) {
        model.addAttribute("Employee", new Employee());
        return "add-employees";
    }

    @PostMapping("add")
    public String addEmployees(@RequestParam("name") String name,
                               @RequestParam("department") String department,
                               @RequestParam("email") String email,
                               @RequestParam("salary") Double salary, Model model) {
        Employee emp = new Employee(employeeList.size(), name, department, email, salary);
        employeeList.add(emp);
        model.addAttribute("employees", employeeList);
        return "list-employees";
    }

    @GetMapping("search")
    public String searchPageDisplay()
    {
        return "search-employees";
    }
    @PostMapping("search")
    public String searchKeyword(@RequestParam("keyword") String keyword, Model model)
    {
        List<Employee> searchedEmployees = employeeList.stream().filter(emp->emp.getName().equalsIgnoreCase(keyword)
                || emp.getDepartment().equalsIgnoreCase(keyword))
                .toList();
        model.addAttribute("employees", searchedEmployees);
        return "list-employees";
    }

    @GetMapping("delete/{id}")
    public String deleteEmployees(@PathVariable("id") int id, Model model)
    {
        employeeList.removeIf(emp->emp.getId()==id);
        model.addAttribute("employees", employeeList);
        return "list-employees";
    }
}
