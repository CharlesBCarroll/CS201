public class PersonTest {
    public static void main(String[] args) {
        // Creating an Employee
        Employee employee = new Employee("John Doe", "123 Company St", "123-456-7890", "john@example.com", 50000, 1500);

        // Creating a Customer
        Customer customer = new Customer("Alice Smith", "456 Main St", "987-654-3210", "alice@example.com", "Purchased items X, Y, Z");

        // Displaying information
        System.out.println("Employee Information:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Address: " + employee.getAddress());
        System.out.println("Phone Number: " + employee.getPhoneNumber());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Salary: $" + employee.getSalary());
        System.out.println("Tax Information: $" + employee.getTaxInformation());

        System.out.println("\nCustomer Information:");
        System.out.println("Name: " + customer.getName());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Phone Number: " + customer.getPhoneNumber());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Purchase History: " + customer.getPurchaseHistory());
    }
}