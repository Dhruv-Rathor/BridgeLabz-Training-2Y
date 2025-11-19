import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDepartmentMap {
    public static void main(String[] args) {
        Map<Integer, String> employeeDepartments = new HashMap<>();

        // 1. Add multiple employees under different departments
        employeeDepartments.put(101, "HR");
        employeeDepartments.put(102, "IT");
        employeeDepartments.put(103, "Finance");
        employeeDepartments.put(104, "HR");
        employeeDepartments.put(105, "IT");
        employeeDepartments.put(106, "Sales");

        System.out.println("Initial Employee Departments: " + employeeDepartments);

        // 2. Change department of an employee
        employeeDepartments.put(103, "IT");
        System.out.println("After Employee 103 moved to IT: " + employeeDepartments);

        // 3. Find all employees working in a given department (reverse lookup)
        List<Integer> hrEmployees = findEmployeesByDepartment(employeeDepartments, "HR");
        System.out.println("\nEmployees in HR: " + hrEmployees);

        List<Integer> itEmployees = findEmployeesByDepartment(employeeDepartments, "IT");
        System.out.println("Employees in IT: " + itEmployees);

        // 4. Print total employees per department (grouping logic)
        printEmployeeCountByDepartment(employeeDepartments);
    }

    public static List<Integer> findEmployeesByDepartment(Map<Integer, String> employeeDepartments, String department) {
        List<Integer> employeeIds = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : employeeDepartments.entrySet()) {
            if (entry.getValue().equals(department)) {
                employeeIds.add(entry.getKey());
            }
        }
        return employeeIds;
    }

    public static void printEmployeeCountByDepartment(Map<Integer, String> employeeDepartments) {
        Map<String, Integer> deptCounts = new HashMap<>();
        for (String department : employeeDepartments.values()) {
            deptCounts.merge(department, 1, Integer::sum);
        }

        System.out.println("\nTotal Employees per Department:");
        deptCounts.forEach((dept, count) -> System.out.println(dept + ": " + count));
    }
}
