package paymentprocess;

public class paymentServicesImpl implements PaymentServices{
  public void processPayment(){

  }
  public void makePayment(payment p){
      p.process_Payment();
  }


  public static void main(String[] args) {
    paymentServicesImpl services = new paymentServicesImpl();
    payment p1 = new upi("user@upi", 500.0, "TXN12345");
payment p2 = new card(1234567890123456L, 123, "12/28", 1000.0, "TXN12346");

services.makePayment(p1);
services.makePayment(p2);
  }
}
