public class array1 {

  public static int arr(int a[]){

    if(a==null){
      return 0;
     }
    int sum = 0;
    for(int i = 0;i<=a.length-1;i++){
    
        sum += a[i];
      
    }

   
     return sum;
  }
  
  
  public static void main(String[] args) {
    int a[] = {10,20,45,65};
    int result = arr(a);
    System.out.println(result);
   

  }
}
