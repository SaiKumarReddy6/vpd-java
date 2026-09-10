import java.util.Scanner;
public class invoiceCalculator {
  static Scanner sc = new Scanner(System.in);

  public static int calculateSubtotal(int Price,int Quantity){
    int Subtotal = Price * Quantity;
    return Subtotal;
  }

  public static boolean validation(int Price,int Quantity){
    if(Price<=0 || Quantity<=0){
        return false;
    }else{
      return true;
    }
  }

  public static double CalculateDiscount(double subTotal,int Discount){
    Double Discount_Amount = subTotal * Discount/100;
    return Discount_Amount;
  }

  public static double CalculateTotal(double subTotal,double discount){
    double Final_Total = subTotal - discount;
    return Final_Total;
  }

  public static boolean validateDiscount(int Discount){
      if(Discount<0 || Discount>100){
        return false;
      }else{
        return true;
      }
  }

  public static double tax(double total_Amount,int tax_Per){
      double tax_Amount = total_Amount * tax_Per/100;
      return tax_Amount;
  }

  public static double CalculateFinalAmount(double total_Amount, double tax){

      double final_Amount = total_Amount + tax;

      return final_Amount;

  }

  public static void main(String[] args) {
    System.out.println("Enter the price here...");
    int Price = sc.nextInt();
    System.out.println("Enter the Quantity here......");
    int Quantity = sc.nextInt();
    System.out.println("Enter the discount value");
    int Discount = sc.nextInt();
    System.out.println("Enter the tax here");
    int tax_Per = sc.nextInt();


    if(validation(Price, Quantity)){
    double subTotal = calculateSubtotal(Price, Quantity);
     System.out.printf("Amount: %.2f%n",subTotal);


     if(validateDiscount(Discount)){
     double discount = CalculateDiscount(subTotal, Discount);
     System.out.printf("Discount Amount: %.2f%n", discount);


     double total_Amount = CalculateTotal(subTotal, discount);
     System.out.printf("total Amount: %.2f%n" , total_Amount);


     double tax = tax(total_Amount,tax_Per);
     System.out.printf("tax: %.2f%n",tax);


     double final_Amount = CalculateFinalAmount(total_Amount, tax);
     System.out.printf("Final Amount: %.2f%n", final_Amount);


     }else{
      System.out.println("You have entered either less then nor greater than 100");
     }

     
    }else{
      System.out.println("There is an either Zero or negative value is present so we cannot proceed with calculation");
    }
    
   
   
  }
}
