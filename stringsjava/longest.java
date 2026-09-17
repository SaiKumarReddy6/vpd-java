package stringsjava;

public class longest {


   public static String longest(String[] arr){
    String longest = arr[0];
    for(int i = 0;i<arr.length;i++){
      if(arr[i]!=null){
         if(arr[i].length()>longest.length()){
        longest = arr[i];
      }
      }
      
    }
     return longest;
  }
  public static void main(String [] args){
    String[] arr = {"cat", "apple",null,"banana", "elephant"};
    String result = longest(arr);
    System.out.println("The longest string in the array is: " + result + " with length: " + result.length());

  }
 
}
