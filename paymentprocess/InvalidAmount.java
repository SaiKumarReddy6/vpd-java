package paymentprocess;

public class InvalidAmount extends Exception {
  private String message;
 public InvalidAmount(String message) {
    super(message);
  }
}
