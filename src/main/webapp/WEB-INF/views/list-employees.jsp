<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee List</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center">Employee Management System</h1>
        <h3 class="mt-4">Employee List</h3>

        <table class="table table-bordered table-striped mt-3">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Department</th>
                    <th>Email</th>
                    <th>Salary</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="employee" items="${employees}">
                    <tr>
                        <td>${employee.id}</td>
                        <td>${employee.name}</td>
                        <td>${employee.department}</td>
                        <td>${employee.email}</td>
                        <td>${employee.salary}</td>
                        <td>
                            <a href="/employees/delete/${employee.id}" onclick="return confirm('Are you sure you want to delete this employee?');">
                            Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
            <a class="btn btn-secondary mt-3" href="/employees/add">Add Employee</a>
            <a class="btn btn-secondary mt-3" href="/employees/search">Search employees</a>
    </div>
</body>
</html>
