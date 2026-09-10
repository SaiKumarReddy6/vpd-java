package string;
import java.util.Scanner;
public class uplo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Name Here...........");
    String name = sc.next();
    System.out.println(name.toUpperCase());
    System.out.println("Enter Your Sister Name...........");
    String sisterName = sc.next();
    System.out.println(sisterName.toLowerCase());
    System.out.println(name);
    System.out.println(sisterName);
  }
}
