package arraysjava;

public class sl {

  public static int[] smallLarge(int[] arr){
    int small = arr[0];
    int large = arr[0];
    for(int i = 0;i<arr.length;i++){
           if(arr[i]<small){
            small = arr[i];
           }if(arr[i]>large){
            large = arr[i];
           }
    }
    return new int[]{small,large};
  }
  public static void main(String[] args) {
    int [] arr = {10,2,5,70,30};
    int result[] = smallLarge(arr);
    System.out.println("Smallest element: " + result[0]);
    System.out.println("Largest element: " + result[1]);
  }
}
