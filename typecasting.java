public class typecasting {
  public static void main(String[] args) {
    int l = 'A'; //-----> widening 

    double b = 25.6;
   
    //-----> here we used int as a datatype but we declared the data as a char which means smaller datatype to larger datatype it has been done by complier implicitly
    System.out.println(l + b);
     //---> here A becames 65.0 double as numeric promtion during calculation 

    int n = (short)327688;// here we trying change data from byte to short we can expect data loss here which means (narrowing)
       System.out.println(n);
  }
}
