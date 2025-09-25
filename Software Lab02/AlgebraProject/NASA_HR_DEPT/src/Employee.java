public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String department;
    private double salary;

    public Employee(int id, String firstName, String lastName, String department, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    // Display info
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + firstName + " " + lastName +
                ", Department: " + department + ", Salary: $" + salary);
    }
}
