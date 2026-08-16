public class Manager extends Employee {
private int teamSize;

```
public Manager(int id, String name, double salary, int teamSize) {
    super(id, name, salary);

    if (teamSize < 0) {
        throw new IllegalArgumentException("Team size cannot be negative.");
    }

    this.teamSize = teamSize;
}

public int getTeamSize() {
    return teamSize;
}

public void setTeamSize(int teamSize) {
    if (teamSize < 0) {
        throw new IllegalArgumentException("Team size cannot be negative.");
    }
    this.teamSize = teamSize;
}

@Override
public String getRole() {
    return "Manager";
}

@Override
public void displayDetails() {
    super.displayDetails();
    System.out.println("Team Size: " + teamSize);
}
```

}
