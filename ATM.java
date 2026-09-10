import java.util.Random;
import java.util.Scanner;
public class ATM {
  static Scanner sc = new Scanner(System.in);
  public static boolean login(){
    String name = "SaiKumarReddy";
    System.out.println("Please Enter the valid user_name");
    String User_name = sc.next();
    String password = "9921004";
    System.out.println("Please enter valid user_password");
    String User_password = sc.next();

    if(name.equals(User_name)){
      System.out.println("User Name is Matched with tha Acutal Name");
      
    if(password.equals(User_password)){
      System.out.println("User Password is matched with the actual Password");
      System.out.println("Login Successfull");
      return true;
    }else{
      System.out.println("Invalid Password");
      return false;
    }
    
  }else{
    System.out.println("Invalid User_Name");
    return false;
  }
}

public static void OTP(){
  int attempt = 3;
  Random r = new Random();
  while(attempt>0){
     int otp = r.nextInt(9000)+1000;
     System.out.println(otp);
     System.out.println("Enter the valid otp here");
     int user_otp = sc.nextInt();
     if(otp == user_otp){
      System.out.println("otp verification completed");
      break;
     }else{
     attempt--;
    System.out.println("You have completed one of three otp verification for today " + attempt);
     }
     if(attempt==0){
      System.out.println("You have completed 3 otp verfiaction for today comeback tomorrow exact this time to try again");
     }

  }
}
  public static void main(String[] args) {
   
    login();
    OTP();
  }

}
