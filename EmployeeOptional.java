package assignment;

import java.util.Optional;

public class EmployeeOptional {
    private int id;
    private String name;
    private Optional<String> email;
    private Optional<String> department;

    public EmployeeOptional(int id, String name, Optional<String> email, Optional<String> department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() throws MissingRequiredFieldException {
        if (name == null || name.trim().isEmpty()) {
            throw new MissingRequiredFieldException("❌ Name is required but missing!");
        }
        return name;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public Optional<String> getDepartment() {
        return department;
    }
}
