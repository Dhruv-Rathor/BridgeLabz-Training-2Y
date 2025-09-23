import java.util.ArrayList;
import java.util.List;

// --- Interfaces and Classes (non-public) ---
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    protected double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { if(employeeId > 0) this.employeeId = employeeId; }

    public String getName() { return name; }
    public void setName(String name) { if(name != null) this.name = name; }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { if(baseSalary >= 0) this.baseSalary = baseSalary; }

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name);
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int id, String name, double salary) { super(id, name, salary); }
    @Override
    public double calculateSalary() { return getBaseSalary(); }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;

    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() { return getBaseSalary() * hoursWorked; }
}

// --- Main Public Class ---
public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee(1, "Alice", 50000));
        employees.add(new PartTimeEmployee(2, "Bob", 25, 160));

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Calculated Salary: $" + emp.calculateSalary());
            System.out.println("--------------------");
        }
    }
}
