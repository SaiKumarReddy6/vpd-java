package stringsjava;

import java.util.Scanner;

public class target {

  public static int target(String[] str, String target){
    int count = 0;
    for(int i = 0;i<str.length;i++){
      if(str[i].equals(target)){
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String [] str = {"apple","banana","mango","apple","grapes"};
    System.out.println("Enter the target string to search for: ");
    String target = sc.nextLine();
    int result = target(str,target);
    System.out.println("The target string '" + target + "' appears " + result + " times in the array.");
  
  }
}
