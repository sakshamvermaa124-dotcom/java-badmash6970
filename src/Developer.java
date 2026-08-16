public class Developer extends Employee {
private final String programmingLanguage;

```
public Developer(int id, String name, double salary, String programmingLanguage) {
    super(id, name, salary);

    if (programmingLanguage == null || programmingLanguage.isBlank()) {
        throw new IllegalArgumentException("Programming language cannot be empty.");
    }

    this.programmingLanguage = programmingLanguage;
}

public String getProgrammingLanguage() {
    return programmingLanguage;
}

@Override
public String getRole() {
    return "Developer";
}

@Override
public void displayDetails() {
    super.displayDetails();
    System.out.println("Programming Language: " + programmingLanguage);
}
```

}
