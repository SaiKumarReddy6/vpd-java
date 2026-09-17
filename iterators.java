import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterators {
  public static void main(String[] args) {
      List<Integer> numbers = new ArrayList<>();
  numbers.add(10);
  numbers.add(20);
  numbers.add(30);
  numbers.add(40);
  numbers.add(50);
  System.out.println(numbers);


  Iterator<Integer> it =  numbers.iterator();
  
  while(it.hasNext()){
    int num = it.next();
    System.out.println(num);
   if(num == 30){
    it.remove();
    
   }
   
   
  }
  System.out.println(numbers);
  }

}

