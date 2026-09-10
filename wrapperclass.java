public class wrapperclass {
  public static void main(String[] args) {
    int num = 7;
    Integer num1 = num; // autoboxing which means when we store primitive value in object automattically.
    Integer myInt = 5;
    Double myDouble = 5.99;
    Character myChar = 'A';

    int num2 = num1; //auto-unboxing which means we get the primitive value from the object.
    
    System.out.println(myInt);
    System.out.println(myDouble);
    System.out.println(myChar);
    System.out.println(num1);
    System.out.println(num2);
  }
}
