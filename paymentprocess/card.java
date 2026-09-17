package paymentprocess;

public class card extends payment implements PaymentServices, paymentValidator{
  private long card_number;
  private int cvv;
  private String card_expiry_date;
  public card(long card_number, int cvv, String card_expiry_date, double amount, String transcation_id){
    super(amount,transcation_id);
    this.card_number = card_number;
    this.cvv = cvv;
    this.card_expiry_date = card_expiry_date;
  }
@Override 
  public void process_Payment(){
    try {
      validateamount();
      setStatus("SUCCESS");
      RecordTransaction("Card");
    } catch (InvalidAmount e) {
      setStatus("FAILED");
      RecordTransaction("Card");
      System.out.println(e.getMessage());
    }catch(PaymentLimitException e){
      setStatus("FAILED");
      RecordTransaction("Card");
      System.out.println(e.getMessage());
    }
  }

  @Override 
  public void processPayment() {
    System.out.println("Processing payment through Card with Card Number: " + this.card_number);
  }
  @Override 
  public void validatePayment() {
    try {
        validateamount();
     setStatus("SUCCESS");
    } catch (InvalidAmount e) {
      setStatus("FAILED");
      System.out.println(e.getMessage());
    }catch(PaymentLimitException e){
      setStatus("FAILED");
      System.out.println(e.getMessage());
    }
    
  }




  public static void main(String [] args){
    payment p1 = new upi("user@upi", 500.0, "TXN12345");
    payment p2 = new card(1234567890123456L, 123, "12/28", 1000.0, "TXN12345");
    payment p3 = new card(123455665476719L, 344, "9/27", 150000.0, "TXN65786");
    p1.process_Payment();
    p2.process_Payment();
    p3.process_Payment();
  }



}
