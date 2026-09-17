package bankaccount;

public class savingsaccount extends Bank {
   
  public savingsaccount(String account_Holder_name, long account_number, int balance){
    super(account_Holder_name, account_number, balance);
  }

   @Override 
  public void accountDetails() {
    System.out.println("Savings account: ");
  }
  public static void main(String[] args) {
 Bank b = new savingsaccount("Kapa Ravi", 123456789, 100000);
   b.accountDetails();
   
    
  }
}
