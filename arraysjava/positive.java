package arraysjava;


public class positive{

  public static int[] positive(int[] arr){
   
    int count = 0;
    for(int i = 0;i<arr.length;i++){
      if(arr[i]>0){
        count++;
      }
    }
    int i = 0;
    int size[] = new int[count];
    for(int j = 0;j<arr.length;j++){
      if(arr[j]>0){
        size[i] = arr[j];
        i++;
      }
    }
    return size;
    
  }
  public static void main(String [] args){
     int [] arr = {5,-7,2,-1,60,-70};
     int result[] = positive(arr);
      System.out.println("Positive elements in the array: " +java.util.Arrays.toString(result));
     
   
  }
}