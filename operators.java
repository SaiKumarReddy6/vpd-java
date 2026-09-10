public class operators {
  public static void main(String[] args) {
    int a = 20;
    int b = 22;

    // //-----> special operators
    // // a += 2;
    // // a /=2;
    // a *=2;
    // System.out.println(a);
    // // b -= 2;
    // b %= 2;
    // System.out.println(b);





    //----> arithmetic operations

    // int ref = a+b;
    // int sub = a-b;
    // int mul = a*b;
    // int  div = a/b;
    // int mod = a%b;
    // System.out.println(ref + " " + sub + " " + mul + " " + div + " " + mod);

    //--> Increment operations  and logical operations and logical operator 
 
    if (a!=b || a>b){ //---> we can use here as ==,>=,<=,>,< also to compare the data and for logical operator we use ||(or) !(not) operators
        a++;
        b--;
         System.out.println(a + " " + b);
    }else{
      System.out.println("condition is false");
    }
   

     
  }
}
