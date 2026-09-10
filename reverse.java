public class reverse{

  public static void reverse(int a[]){
    int left = 0;
    int right = a.length-1;
    while(left<right){
      int temp = a[left];
      a[left] = a[right];
      a[right] = temp;

      left++;
      right--;


    }
  }
  public static void main(String[] args) {
    int a[] = {1,2,3,4,5,6,7};
     reverse(a);
     for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
     }
    
  }
} 