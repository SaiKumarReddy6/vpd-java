
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collections {
 public static void main(String[] args) {
  List<Integer> num = new ArrayList<>();

  num.add(50);
  num.add(20);
  num.add(40);
  num.add(10);
  num.add(30);
  System.out.println(num);
  Collections.sort(num);
  System.out.println(num);
  Collections.sort(num, Collections.reverseOrder());
  System.out.println(num);
 } 
}
