package bankaccount;

import java.util.Scanner;

public class Bank {
  private String account_Holder_name;
  private long account_number;
  private int balance;

  public Bank(String account_Holder_name, long account_number, int balance) {
    this.account_Holder_name = account_Holder_name;
    this.account_number = account_number;
    this.balance = balance;
  }

  public void withdraw(int amount) {
    if (balance >= amount && balance > 100) {
      balance -= amount;
      System.out.println("Amount withdrawn: " + amount);
      System.out.println("Ramaining Balance: " + balance);
    } else {
      System.out.println("Insufficient funds or balance below minimum required.");
    }
  }

  public void deposit(int amount) {
    balance += amount;
    System.out.println("Amount Deposited: " + amount);
    System.out.println("New Balance: " + balance);
  }

  public void accountDetails() {
    System.out.println("Account Holder Name: " + account_Holder_name);
    System.out.println("Account Number: " + account_number);
    System.out.println("Account Balance: " + balance);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Account Holder Name: ");
    String name = sc.nextLine();
    System.out.println("Enter Account Number: ");
    long number = sc.nextLong();
    System.out.println("Enter Initial Balance: ");
    int balance = sc.nextInt();
    Bank b1 = new Bank(name, number, balance);
    b1.accountDetails();
    b1.deposit(50000);
    b1.withdraw(25000);

  }
}