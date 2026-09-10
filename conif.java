import java.util.Scanner;

public class conif {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age here..");
    int age = sc.nextInt();
    if (age >= 18) {
      System.out.println("Your are eligible to vote");
    }

    // if else
    int number = 4;
    if (number % 2 == 0) {
      System.out.println(number + " is an even number");
    } else {
      System.out.println(number + " is an odd number");
    }

    // nested if
    String name = "sai";
    System.out.println("Enter the user name");
    String user_name = sc.next();
    String Password = "1234";
    System.out.println("Enter the user_password");
    String user_password = sc.next();
    if (name.equals(user_name)) {
      System.out.println("User name is successfully matched");
      if (Password.equals(user_password)) {
        System.out.println("Password is matched successfully");
      } else {
        System.out.println("You have entered invalid password");
      }
    } else {
      System.out.println("You have entered invalid user name");
    }

    // else if----------------------------------------------------------------

    System.out.println("________________________________________________________");

    int marks = 86;
    String Grade;
    if (marks >= 90 && marks <= 100) {
      System.out.println(Grade = "A");
    } else if (marks >= 80 && marks <= 89) {
      System.out.println(Grade = "B");
    } else if (marks >= 70 && marks <= 79) {
      System.out.println(Grade = "C");
    } else if (marks >= 60 && marks <= 69) {
      System.out.println(Grade = "D");
    } else if (marks >= 50 && marks <= 59) {
      System.out.println(Grade = "E");
    } else {
      System.out.println("Fail");
    }

    // switch
    System.out.println("_____________________________________________________");
    System.out.println("Enter your Choice");
    int choice = sc.nextInt();

    switch (choice) {
      case 1: {
        System.out.println("1.Add Student");
        break;
      }
      case 2: {
        System.out.println("2.View Student");
        break;
      }
      case 3: {
        System.out.println("3.Delete Student");
        break;
      }
      case 4: {
        System.out.println("4.Exit");
        break;
      }
      default: {
        System.out.println("You have choosen invalid number");
      }
    }

    // while loop

    System.out.println("____________________________________________________________");
    System.out.println("Enter num value here...");
    int num = sc.nextInt();
    int sum = 0;
    while (num <= 5) {
      sum += num;
      System.out.println(sum);
      num++;
    }

    // do while

    System.out.println("___________________________________________________________");
    System.out.println("Enter the value");
    int value = sc.nextInt();
    int product = 1;
    do {
      product *= value;
      System.out.println(product);

      value++;
    } while (value <= 3);

    // for loop

    System.out.println("_______________________________________________________________");

    System.out.println("Enter the value2");
    int value2 = sc.nextInt();

    for (int i = 1; i <= value2; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      } else {
        System.out.println("those are not even numbers to print");
      }
    }

    // nested loop

    System.out.println("______________________________________");
    System.out.println("enter the rows");
    int row = sc.nextInt();

    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= row; j++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }

    // break in loop

    System.out.println("________________________________________________");
    System.out.println("enter the value3");
    int value3 = sc.nextInt();
    for (int i = 1; i <= value3; i++) {
      if (i == 10) {
        break;
      }
    }

    // continue in loop

    System.out.println("____________________________________");

    System.out.println("Enter the value4");
    int value4 = sc.nextInt();

    for (int i = 1; i <= value4; i++) {
      if (i == 20) {
        continue;
      }
      System.out.println(i);
    }

    // sentinal-controlled loop

    System.out.println("___________________________________________");
    System.out.println("enter the value5 here....");
    int value5 = sc.nextInt();
    while (value5 != -1) {

      System.out.println(value5);
      value5 = sc.nextInt();
    }

    // labeled loop

    System.out.println("_____________________________________________________");
    System.out.println("Enter the val number here....");
    int val = sc.nextInt();
    outer: for (int i = 1; i <= val; i++) {
      for (int j = 1; j <= 4; j++) {
        if (i == 2) {
          break outer;
        }
        System.out.println(i + " " + j);
      }

    }

    // infinity for loop
    System.out.println("___________________________________________________");
    System.out.println("Enter the val2");
    int val2 = sc.nextInt();
    for (int i = val2;; i++) {
      if (i == 5) {
        break;
      }
      System.out.println("hello");
    }

  }
}
