package string;
import java.util.Scanner;
public class check {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String user_Name = "Sai";
    System.out.println("Enter username here");
    String entered_Name = sc.next();

    System.out.println(user_Name.equals(entered_Name));
    System.out.println(user_Name.equalsIgnoreCase(entered_Name));
  }
}
