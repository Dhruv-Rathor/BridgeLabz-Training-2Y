import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String employeeName) {
        this.employees.add(new Employee(employeeName));
    }

    public void showEmployees() {
        System.out.println("  Employees in " + name + " Department:");
        for (Employee emp : employees) {
            System.out.println("  - " + emp.getName());
        }
    }
}

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        // Composition: Departments are created and owned by the Company
        this.departments.add(new Department("HR"));
        this.departments.add(new Department("Engineering"));
    }

    public Department getDepartment(String name) {
        for (Department dept : departments) {
            if (dept.name.equals(name)) {
                return dept;
            }
        }
        return null;
    }

    public void showCompanyStructure() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.showEmployees();
        }
    }
}

public class Problem3_CompanyComposition {
    public static void main(String[] args) {
        Company myCompany = new Company("TechCorp");

        myCompany.getDepartment("Engineering").addEmployee("Bob");
        myCompany.getDepartment("HR").addEmployee("Alice");

        myCompany.showCompanyStructure();
        
        System.out.println("If 'myCompany' is deleted, its departments and employees are also gone.");
    }
}
