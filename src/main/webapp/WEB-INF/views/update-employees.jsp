<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Update Employee</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
    <h1>Update Employee</h1>
    <form action="/employees/update" method="post">
        <input type="hidden" name="id" value="${employee.id}" />

        <label for="name">Name:</label>
        <input type="text" id="name" name="name" value="${employee.name}" required />
        <br><br>

        <label for="department">Department:</label>
        <input type="text" id="department" name="department" value="${employee.department}" required />
        <br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" value="${employee.email}" required />
        <br><br>

        <label for="salary">Salary:</label>
        <input type="number" id="salary" name="salary" value="${employee.salary}" required />
        <br><br>

        <button class="btn btn-primary mt-3" type="submit">Update Employee</button>
        <a class="btn btn-secondary mt-3" href="/employees/">Cancel</a>
    </form>
</body>
</html>
