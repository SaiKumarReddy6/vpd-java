
import java.util.ArrayList;
import java.util.List;
public class al {

  public static void main(String[] args) {
    ArrayList<String> family = new ArrayList<>();
    family.add("1");
    family.add("2");
    family.add("3");
    family.add("4");
   
    System.out.println(family.size());
    System.out.println(family.get(0));
    System.out.println(family.set(1, "BHAVANA"));
    System.out.println(family.remove(0));
    System.out.println(family.contains("Prabhavathi"));
     System.out.println(family);

     System.out.println("_________________________________________");

     ArrayList<Integer>  arr = new ArrayList<>();
     arr.add(10);
     arr.add(20);
     arr.add(30);
     arr.add(40);
     arr.add(50);
     System.out.println(arr);

     System.out.println(arr.get(2));
     System.out.println(arr.set(2,35));
     System.out.println(arr.remove(4));
     System.out.println(arr.contains(20));
     System.out.println(arr);
    for(int number : arr){
      
      System.out.println(number);

    }

    System.out.println("______________________________________________________");

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(20);

    ArrayList<Integer> Extra =  new ArrayList<>();
    Extra.add(30);
    Extra.add(40);

    numbers.addAll(Extra);

    System.out.println(numbers);
    System.out.println("________________________________________________________");

    List<Integer> num = new ArrayList<>();
  num.add(10);
  num.add(20);
  num.add(30);
  num.add(40);
  num.add(50);
  System.out.println(num);
    
  }
}
