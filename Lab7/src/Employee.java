public class Employee extends Person {
    private double salary;
    private double taxInformation;

    // Constructor
    public Employee(String name, String address, String phoneNumber, String email, double salary, double taxInformation) {
        super(name, address, phoneNumber, email);
        this.salary = salary;
        this.taxInformation = taxInformation;
    }

    // Getters specific to Employee
    public double getSalary() {
        return salary;
    }

    public double getTaxInformation() {
        return taxInformation;
    }
}