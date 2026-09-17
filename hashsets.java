import java.util.HashSet;
import java.util.Set;
public class hashsets {
  public static void main(String[] args) {
    Set<Integer> numbers = new HashSet<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(50);
    numbers.add(20);
    numbers.add(10);
    System.out.println(numbers);
    System.out.println(numbers.contains(30));
    System.out.println(numbers.contains(100));
    System.out.println(numbers.remove(20));
    System.out.println(numbers);
    System.out.println(numbers.size());
  }
}
