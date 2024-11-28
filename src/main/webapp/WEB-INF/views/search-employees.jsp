<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Search Employees</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
    <h1>Search Employees</h1>
        <div class="container mt-5">
    <form action="/employees/search" method="post">
        <label for="keyword">Search by Name or Department:</label>
        <input type="text" id="keyword" name="keyword" required />
        <button class="btn btn-primary" type="submit">Search</button>
    </form>
    </div>
    <br>
    <a class="btn btn-secondary mt-3" href="/employees/">Back to Employee List</a>
</body>
</html>
