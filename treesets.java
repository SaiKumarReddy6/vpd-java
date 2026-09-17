import java.util.Set;
import java.util.TreeSet;

public class treesets {
  public static void main(String[] args) {
    Set<Integer> num = new TreeSet<>();
    num.add(50);
    num.add(20);
    num.add(40);
    num.add(10);
    num.add(30);
    num.add(20);
    System.out.println(num);
  }
}
