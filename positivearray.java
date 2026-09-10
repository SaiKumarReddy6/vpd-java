import java.util.Scanner;
public class positivearray {
static Scanner sc = new Scanner(System.in);
  public static int positive(int a[]){
    int result = a[0]; 
    for(int i = 0;i<a.length;i++){
      if(a[i]>0){
         result = a[i];
      }
    }
    return result;
  }
  public static void main(String[] args) {
    int a[] = {10,-2,-5,16,-23,70};
    for(int i = 0;i<a.length;i++){
      
    }
    System.out.println(positive(a));
  }
}
