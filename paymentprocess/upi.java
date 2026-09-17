package paymentprocess;

public class upi extends payment implements PaymentServices, paymentValidator{
   private String upi_Id;

   public upi(String upi_Id, double amount, String transcation_id){
      super(amount,transcation_id);
      this.upi_Id = upi_Id;
   }
@Override
 void process_Payment(){
   try{
      validateamount();
      setStatus("SUCCESS");
      RecordTransaction("UPI");
   }catch(InvalidAmount e){
      setStatus("FAILED");
      RecordTransaction("UPI");
      System.out.println(e.getMessage());
   }catch(PaymentLimitException e){
           setStatus("FAILED");
           RecordTransaction("UPI");
           System.out.println(e.getMessage());
   }
 }
 @Override 
 public void processPayment() {
    System.out.println("Processing payment through UPI with UPI ID: " + this.upi_Id);
  }

  @Override 
  public void validatePayment(){
   try{
         validateamount();
         setStatus("SUCCESS");
      
         
   }catch(InvalidAmount e){
      setStatus("FAILED");
      
      System.out.println(e.getMessage());
  }catch(PaymentLimitException e){
   setStatus("FAILED");
    System.out.println(e.getMessage());
  }
}
}
