public abstract class Employee {
private final int id;
private String name;
private double salary;

```
public Employee(int id, String name, double salary) {
    if (id <= 0) {
        throw new IllegalArgumentException("Employee ID must be positive.");
    }
    if (name == null || name.isBlank()) {
        throw new IllegalArgumentException("Employee name cannot be empty.");
    }
    if (salary < 0) {
        throw new IllegalArgumentException("Salary cannot be negative.");
    }

    this.id = id;
    this.name = name;
    this.salary = salary;
}

public int getId() {
    return id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    if (name == null || name.isBlank()) {
        throw new IllegalArgumentException("Employee name cannot be empty.");
    }
    this.name = name;
}

public double getSalary() {
    return salary;
}

public void setSalary(double salary) {
    if (salary < 0) {
        throw new IllegalArgumentException("Salary cannot be negative.");
    }
    this.salary = salary;
}

public abstract String getRole();

public void displayDetails() {
    System.out.printf(
            "ID: %d | Name: %s | Role: %s | Salary: %.2f%n",
            id, name, getRole(), salary
    );
}
```

}
