
import java.util.LinkedList;
import java.util.List;

public class ll {
  public static void main(String[] args) {
    List<Integer> numbers = new LinkedList<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(50);
    System.out.println(numbers);
    numbers.addFirst(5);
  numbers.addLast(60);
  System.out.println(numbers);
  System.out.println(numbers.getFirst());
  System.out.println(numbers.getLast());
  System.out.println(numbers.removeFirst());
  System.out.println(numbers.removeLast());
  System.out.println(numbers);
  }
}
