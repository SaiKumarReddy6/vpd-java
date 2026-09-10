import java.util.Scanner;
public class simplecalculator{
  static Scanner sc = new Scanner(System.in);
  
   public static double calculator(int a,int b){
      int choice = sc.nextInt();
      switch(choice){
        case 1: {
          
           System.out.println("1.ADDITION");
           return a + b;
           
        }
        case 2:{
          System.out.println("2.SUBSTRACTION");
            return a - b;
        }
          
        case 3: {
          System.out.println("3.DIVISION");
          if(validatedivision(b)){
                return a/b;
          }else{
            System.out.println("division won't have with zero value");
            return 0;
          }
          
        }
        case 4: {
          System.out.println("4.MODULUS");
          return a%b;
        }
        case 5: {
          System.out.println("5.Multiplication");
          return a*b;
        }
        default : {
             System.out.println("Invalid choice");
             return 0;
        }
        }
        
      }
      public static boolean validatedivision(int b){
            if(b==0){
              return false;
            }else{
              return true;
            }

            
        }
        public static void main(String[] args) {
          System.out.println("Enter the a value");
          int a = sc.nextInt();
          System.out.println("Enter the b value");
          int b = sc.nextInt();

          double result = calculator(a,b);
          System.out.println("Result " + result);

        }

   }
