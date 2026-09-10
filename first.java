//variable and datatypes
 import java.util.Scanner;
public class first {
 static int var = 5; //------->global variable
  int age = 20; // -------> instance variable generally used in objects
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
   int var2 = 20; //------> local variable

      System.out.println(var + var2);

      first f1 = new first();//instance 
      System.out.println(f1.age);
     
      
      //datatypes
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        if (num >= -128 && num <= 127) {
            System.out.println("The number can be stored in: byte, short, int, long");
        }
        else if (num >= -32768 && num <= 32767) {
            System.out.println("The number can be stored in: short, int, long");
        }
        else if (num >= -2147483648L && num <= 2147483647L) {
            System.out.println("The number can be stored in: int, long");
        }
        else {
            System.out.println("The number can be stored only in: long");
        }
        
   
}

  
  // System.out.println(var2); if we try to print a variable outside its method complier will throw an error
}






