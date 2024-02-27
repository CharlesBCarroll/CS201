public class Customer extends Person {
    private String purchaseHistory;

    // Constructor
    public Customer(String name, String address, String phoneNumber, String email, String purchaseHistory) {
        super(name, address, phoneNumber, email);
        this.purchaseHistory = purchaseHistory;
    }

    // Getter specific to Customer
    public String getPurchaseHistory() {
        return purchaseHistory;
    }
}