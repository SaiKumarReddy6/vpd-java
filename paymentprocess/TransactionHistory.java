package paymentprocess;

public class TransactionHistory {

    private String transaction_id;
    private double amount;
    private String payment_type;
    private String status;

    public TransactionHistory(String transaction_id, double amount,
                               String payment_type, String status) {

        this.transaction_id = transaction_id;
        this.amount = amount;
        this.payment_type = payment_type;
        this.status = status;
    }

    public void displayTransaction() {
        System.out.println("Transaction ID: " + transaction_id);
        System.out.println("Amount: " + amount);
        System.out.println("Payment Type: " + payment_type);
        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {

        TransactionHistory t1 =
            new TransactionHistory("TXN12345", 500.0, "UPI", "SUCCESS");

        t1.displayTransaction();
    }
}