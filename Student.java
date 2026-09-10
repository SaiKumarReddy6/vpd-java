import java.util.Scanner;
import java.util.Random;
public class Student{

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
  public static void main(String[] args) {
    boolean return = login();
  }

}