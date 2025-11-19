import java.util.HashMap;
import java.util.Map;

public class EmployeeSalaryDirectory {
    public static void main(String[] args) {
        Map<String, Double> salaries = new HashMap<>();

        // 1. Add employees with their salaries
        salaries.put("John Doe", 60000.00);
        salaries.put("Jane Smith", 75000.00);
        salaries.put("Peter Jones", 55000.00);
        salaries.put("Sarah Lee", 90000.00);
        salaries.put("Mike Brown", 60000.00);
        salaries.put("Anna White", 120000.00);

        System.out.println("Initial Salaries: " + salaries);

        // 2. Give a raise
        giveRaise(salaries, "Jane Smith", 10.0); // 10% raise
        giveRaise(salaries, "Anna White", 5.0);  // 5% raise
        giveRaise(salaries, "Non Existent", 15.0);

        System.out.println("Salaries After Raises: " + salaries);

        // 3. Print the average salary
        printAverageSalary(salaries);

        // 4. Print the name(s) of the highest-paid employee(s)
        printHighestPaid(salaries);
    }

    public static void giveRaise(Map<String, Double> salaries, String employee, double percentage) {
        salaries.computeIfPresent(employee, (k, currentSalary) -> currentSalary * (1 + percentage / 100.0));
        if (!salaries.containsKey(employee)) {
            System.out.println("Employee not found: " + employee);
        }
    }

    public static void printAverageSalary(Map<String, Double> salaries) {
        if (salaries.isEmpty()) {
            System.out.println("Average Salary: N/A (No employees)");
            return;
        }

        double totalSalary = 0.0;
        for (double salary : salaries.values()) {
            totalSalary += salary;
        }
        double averageSalary = totalSalary / salaries.size();
        System.out.printf("Average Salary of all employees: %.2f%n", averageSalary);
    }

    public static void printHighestPaid(Map<String, Double> salaries) {
        if (salaries.isEmpty()) return;

        double maxSalary = Double.MIN_VALUE;
        for (double salary : salaries.values()) {
            if (salary > maxSalary) {
                maxSalary = salary;
            }
        }

        System.out.println("\nHighest Paid Employee(s) (Salary: " + String.format("%.2f", maxSalary) + "):");
        for (Map.Entry<String, Double> entry : salaries.entrySet()) {
            if (entry.getValue() == maxSalary) {
                System.out.println("- " + entry.getKey());
            }
        }
    }
}
