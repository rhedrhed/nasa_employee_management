import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Hardcoded employee database
        Employee[] employees = {
                new Employee(1, "Alice", "Johnson", "HR", 75000),
                new Employee(2, "Bob", "Smith", "IT", 90000),
                new Employee(3, "Charlie", "Brown", "Marketing", 60000),
                new Employee(4, "David", "Lee", "IT", 85000)
        };

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- HR Employee System ---");
            System.out.println("1. List all employees");
            System.out.println("2. Find employee by ID");
            System.out.println("3. Find employees by department");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (Employee e : employees) {
                        e.displayInfo();
                    }
                    break;

                case 2:
                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();
                    boolean found = false;
                    for (Employee e : employees) {
                        if (e.getId() == id) {
                            e.displayInfo();
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Employee not found!");
                    break;

                case 3:
                    System.out.print("Enter department name: ");
                    scanner.nextLine(); // consume newline
                    String dept = scanner.nextLine();
                    boolean anyFound = false;
                    for (Employee e : employees) {
                        if (e.getDepartment().equalsIgnoreCase(dept)) {
                            e.displayInfo();
                            anyFound = true;
                        }
                    }
                    if (!anyFound) System.out.println("No employees in that department!");
                    break;

                case 0:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        scanner.close();
    }
}
