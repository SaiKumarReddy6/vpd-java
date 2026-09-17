package paymentprocess;

public class PaymentLimitException extends Exception{
   public PaymentLimitException(String Message){
    super(Message);
   }
}