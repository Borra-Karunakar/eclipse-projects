<!DOCTYPE html>
<html>
<head>
    <title>User Registration Form</title>
</head>
<body>
    <h2>User Registration</h2>
    <form action="register" method="post">
        Full name: <input type="text" name="fullname"><br><br>
        E-mail: <input type="email" name="email"><br><br>
        Password: <input type="password" name="password"><br><br>
        Birthday (yyyy-mm-dd): <input type="date" name="dob"><br><br>

        Gender: 
        <input type="radio" name="gender" value="Male"> Male
        <input type="radio" name="gender" value="Female"> Female <br><br>

        Profession:
        <select name="profession">
            <option>Developer</option>
            <option>Designer</option>
            <option>Manager</option>
        </select><br><br>

        Married? <input type="checkbox" name="married" value="Yes"><br><br>

        Note:<br>
        <textarea name="note" rows="4" cols="30"></textarea><br><br>

        <input type="submit" value="Register">
    </form>
</body>
</html>
