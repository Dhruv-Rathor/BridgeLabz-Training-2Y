class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.department = dept;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}

class Payroll {
    public void calculateBonus(Employee e) {
        double bonus = e.getSalary() * 0.10;
        e.setSalary(e.getSalary() + bonus);
    }
}

public class Problem6_EmployeeSystem {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Ravi", "HR", 50000);
        Payroll payroll = new Payroll();

        System.out.println("Employee: " + emp.getName());
        System.out.println("Original Salary: " + emp.getSalary());

        payroll.calculateBonus(emp);

        System.out.println("Salary after 10% bonus: " + emp.getSalary());
    }
}
