package arraysjava;

import java.util.Scanner;

public class sum {

  public static int sum(int[] arr){
    int sum = 0;
    for(int i = 0; i<arr.length;i++){
      sum += arr[i];
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] arr = {10,20,50,70,90};
    int result = sum(arr);
    System.out.println("Sum of array elements: " + result);
    
  }
}
