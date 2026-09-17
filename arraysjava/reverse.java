package arraysjava;

public class reverse {

  public static void reverse(int[] arr){
    int start = 0;
    int end = arr.length-1;
    
      while(start<end){
        int temp = arr[start];
        arr[start]= arr[end];
        arr[end] = temp;
        start++;
      end--;
      }
      
    }

  
  public static void main(String[] args) {
    int [] arr = {10,20,30,40,50};
    System.out.println("Original array: ");
    for(int i = 0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    reverse r = new reverse();
    r.reverse(arr);
    System.out.println("\nReversed array: ");
    for(int i = 0;i<arr.length;i++){
      
      System.out.print(arr[i]+" ");
    }
  }
}
