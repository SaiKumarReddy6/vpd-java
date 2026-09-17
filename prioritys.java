
import java.util.PriorityQueue;

public class prioritys {
  public static void main(String[] args) {
    PriorityQueue<Integer> p = new PriorityQueue<>();
    p.offer(50);
    p.offer(10);
    p.offer(30);
    System.out.println(p.remove());
    System.out.println(p.peek());
    
  }
}
