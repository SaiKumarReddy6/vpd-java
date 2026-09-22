import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class streams {
  public static void main(String[] args) {
    List<Integer> num = Arrays.asList(5,20,84,78,45);
   num.stream().filter(n->n%2==0)
   .forEach(n->System.out.println(n));

   System.out.println("___------__----___-----_--");
       
   num.stream().map(n->n*2).forEach(n->System.out.println(n));
   System.out.println("___------__----___-----_--");

    num.stream().filter(n->n%2==0).map(n->n*2).forEach(n->System.out.println(n));
    System.out.println("___________-----______________-------_______----");
    num.stream().sorted().forEach(n->System.out.println(n));

     System.out.println("___________-----______________-------_______----");

    List<Integer> values = Arrays.asList(5,20,25,40,45,45,20,25);

      values.stream().distinct().forEach(n->System.out.println(n));

         System.out.println("___________-----______________-------_______----");
          values.stream().distinct().limit(2).forEach(n->System.out.println(n));
          System.out.println("___________-----______________-------_______----");

          long count = values.stream().count();
          System.out.println(count);

           System.out.println("___________-----______________-------_______----");
           long count2 =  values.stream().filter(n->n%2==0).count();
           System.out.println(count2);

           System.out.println("___________-----______________-------_______----");

         Optional<Integer> result = values.stream().max(Comparator.naturalOrder());
         System.out.println(result.get());
          



      
  }
}
