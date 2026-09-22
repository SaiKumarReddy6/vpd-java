import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
@FunctionalInterface 
 interface greeting{
  void greet(String name);
 }

 @FunctionalInterface 
 interface calculator{
  int calculate(int a,int b);
 }
public class functionalInterfaces {
  public static void main(String[] args) {
    //  greeting g = new greeting() {
    //   @Override 
    //   public void greet(String name){
    //     System.out.println("hi " + name);

    greeting g = name -> System.out.println("hi " + name);
    
     g.greet("sai");
 
    calculator cal = (a,b)->(a*b);
    System.out.println(cal.calculate(5, 4));
   
    Predicate<Integer> in = n->n%2==0;
    System.out.println(in.test(20));

    Consumer<Integer> con = value->System.out.println("I am : " + value + " now");
    con.accept(24);

    Function<String, Integer> fun = name -> name.length();
    System.out.println(fun.apply("sai"));

    Supplier<Integer> num = ()-> 100;
    System.out.println(num.get());
     
  }
}
