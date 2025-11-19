import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name + " (" + department + ")";
    }
}

public class GroupObjectsByProperty {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR"),
            new Employee("David", "Sales"),
            new Employee("Eve", "IT")
        );

        Map<String, List<Employee>> employeesByDept = new HashMap<>();

        for (Employee emp : employees) {
            employeesByDept.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }

        System.out.println("Employees Grouped by Department:");
        for (Map.Entry<String, List<Employee>> entry : employeesByDept.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
