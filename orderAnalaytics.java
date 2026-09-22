import java.util.ArrayList;  
import java.util.Comparator; 
import java.util.List; 
import java.util.Map; 
import java.util.Optional; 
import java.util.Random; 
import java.util.Scanner; 
import java.util.function.Consumer; 
import java.util.function.Function; 
import java.util.function.Predicate; 
import java.util.stream.Collectors; 
 
public class orderAnalaytics { 
 
    public static void main(String[] args) { 
 
        Scanner sc = new Scanner(System.in); 
 
        System.out.println("Enter the customer name: "); 
        String customer_Name = sc.nextLine(); 
 
        Random ran = new Random(); 
 
        int Order_id1 = ran.nextInt(1000, 10000); 
        int Order_id2 = ran.nextInt(1000, 10000); 
        int Order_id3 = ran.nextInt(1000, 10000); 
 
        Orders r1 = new Orders(Order_id1,customer_Name,"Cricket Bat","Sports",2,1600.45,"Ordered Successfully"); 
 
        Orders r2 = new Orders(Order_id2,customer_Name,"PlayStation 5","Gaming Console",1,65000,"Ordered Successfully"); 
 
        Orders r3 = new Orders(Order_id3,customer_Name,"Red Dead Redemption 2","Game",1,4500,"Ordered Successfully"); 
 
        List<Orders> r = new ArrayList<>(); 
 
        r.add(r1); 
        r.add(r2); 
        r.add(r3); 
 
         
        System.out.println("\nOrders below 50000:"); 
 
        r.stream() 
                .filter(n -> n.getPrice() < 50000) 
                .forEach(n -> System.out.println(n.getPrice())); 
 
         
        System.out.println("\nProduct Names:"); 
 
        r.stream() 
                .map(n -> n.getProduct_name()) 
                .forEach(n -> System.out.println(n)); 
 
         
        long count = r.stream().count(); 
 
        System.out.println("\nTotal Orders: " + count); 
 
        
        Optional<Double> result = r.stream() 
                .map(n -> n.getPrice()) 
                .max(Comparator.naturalOrder()); 
 
        System.out.println("\nMaximum Price: " + result.get()); 
 
        
        Optional<Double> minimum = r.stream() 
                .map(n -> n.getPrice()) 
                .min(Comparator.naturalOrder()); 
 
        System.out.println("Minimum Price: " + minimum.get()); 
 
         
        Predicate<Orders> cost = n -> n.getPrice() > 5000; 
 
        System.out.println("\nOrders above 5000:"); 
 
        r.stream() 
                .filter(cost) 
                .forEach(n -> 
                        System.out.println( 
                                n.getPrice() + " " + n.getProduct_name() 
                        ) 
                ); 
 
       
        Consumer<Orders> consumer = 
                order -> System.out.println( 
                        order.getProduct_name() + " " + order.getPrice() 
                ); 
 
        System.out.println("\nConsumer Output:"); 
 
        r.stream().forEach(consumer); 
 
         
        Function<Orders, Double> priceprocess = 
                order -> order.getPrice(); 
 
        System.out.println("\nPrices using Function:"); 
 
        r.stream() 
                .map(priceprocess) 
                .forEach(n -> System.out.println(n)); 
 
       
        double totalRevenue = r.stream() 
                .mapToDouble(n -> n.getPrice() * n.getQuantity()) 
                .sum(); 
 
        System.out.println("\nTotal Revenue: " + totalRevenue); 
 
         
         
 
        double averagePrice = r.stream() 
                .mapToDouble(n -> n.getPrice()) 
                .average() 
                .orElse(0); 
 
        System.out.println("Average Order Price: " + averagePrice); 
 
      
        System.out.println("\nOrders Sorted By Price:"); 
 
        r.stream() 
                .sorted(Comparator.comparing(n -> n.getPrice())) 
                .forEach(n -> 
                        System.out.println( 
                                n.getProduct_name() + " - " + n.getPrice() 
                        ) 
                ); 
 
         
        Map<String, List<Orders>> categoryGroups = 
                r.stream() 
                        .collect( 
                                Collectors.groupingBy( 
                                        n -> n.getCategory() 
                                ) 
                        ); 
 
        System.out.println("\nOrders Grouped By Category:"); 
 
        categoryGroups.forEach( 
                (category, orders) -> 
                        System.out.println(category + " : " + orders.size()) 
        ); 
 
         
        Map<String, Long> statusCount = 
                r.stream() 
                        .collect( 
                                Collectors.groupingBy( 
                                        n -> n.getStatus(), 
                                        Collectors.counting() 
                                ) 
                        ); 
 
        System.out.println("\nOrders By Status:"); 
 
        statusCount.forEach( 
                (status, total) -> 
                        System.out.println(status + " : " + total) 
        ); 
 
      
        Optional<Orders> expensiveOrder = 
                r.stream() 
                        .filter(n -> n.getPrice() > 50000) 
                        .findFirst(); 
 
        System.out.println("\nExpensive Order:"); 
 
        if (expensiveOrder.isPresent()) { 
            Orders order = expensiveOrder.get(); 
 
            System.out.println( 
                    order.getProduct_name() + " - " + order.getPrice() 
            ); 
        } else { 
            System.out.println("No expensive order found."); 
        } 
 
        sc.close(); 
    } 
}