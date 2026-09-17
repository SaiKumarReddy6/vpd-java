package paymentprocess;
public abstract class payment {
  private double amount;
  private String transaction_id;
  private String Status;

  public payment(double amount, String transaction_id){
    this.amount = amount;
    this.transaction_id = transaction_id;
   
  }

  abstract void process_Payment();
    
  public void validateamount() throws InvalidAmount,PaymentLimitException{
      if(getamount() < 0){
          throw  new InvalidAmount("Invalid amount: " + getamount());
      }
      if(getamount()>100000){
          throw new PaymentLimitException("You have Reached your  please make sure intitate new transaction after 24 hours.");
      }
  }

  public double getamount(){
     return amount;
  }

  

  public String gettransaction_id(){
    return transaction_id;
  }

  public String getStatus(){
    return Status;
  }

  public void setStatus(String Status){
    this.Status = Status;
  }

  public void RecordTransaction(String payment_type){
    TransactionHistory t2 = new TransactionHistory(transaction_id, amount, payment_type, Status);
    t2.displayTransaction();
  }
  public static void main(String [] args){
     
  }
}
