public class Main {
public static void main(String[] args) {
Employee developer = new Developer(
101,
"Saksham",
60000,
"Java"
);

```
    Employee manager = new Manager(
            102,
            "Rahul",
            85000,
            5
    );

    // Polymorphism: Employee references point to different subclasses.
    developer.displayDetails();
    System.out.println();

    manager.displayDetails();
    System.out.println();

    // Demonstrating encapsulation through getters/setters.
    developer.setSalary(65000);
    System.out.println("Updated Developer Salary: " + developer.getSalary());
}
```

}
