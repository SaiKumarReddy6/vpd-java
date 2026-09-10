public class sl {

  public static int[] smla(int a[]){
     int smallest = a[0];
     int largest = a[0];
     
     for(int i = 0;i<a.length;i++){
      if(a[i]<smallest){
        smallest = a[i];
      }
      if(a[i]>largest){
        largest = a[i];
      }
     }
     int result[] = {smallest,largest};
     return result;
  }
  public static void main(String[] args) {
    int a[] = {10,4,2,30,45};
    int result[] = smla(a);
    System.out.println(result[0]);
    System.out.println(result[1]);
  }
}
