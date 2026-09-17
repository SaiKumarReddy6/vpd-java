import java.util.LinkedHashSet;
import java.util.Set;

public class linkedhashsets {
  public static void main(String[] args) {
    Set<Integer> num = new LinkedHashSet<>();
    num.add(30);
    num.add(10);
    num.add(20);
    num.add(10);
    num.add(40);
    num.add(30);
    num.add(50);
    System.out.println(num);
  }
}
