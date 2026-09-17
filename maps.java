import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class maps {
  public static void main(String[] args) {
    Map<Integer, String> details = new HashMap<>();
    details.put(101,"Sai");
    details.put(102,"Rahul");
    details.put(103,"Kiran");
    System.out.println(details);
    System.out.println("___________________________________________________");
    System.out.println(details.get(102));
    System.out.println(details.get(103));
    System.out.println(details.get(105));
    System.out.println("__________________________________________________");
    System.out.println(details.containsKey(101));
    System.out.println(details.containsKey(105));
    System.out.println(details.containsValue("Kiran"));
    System.out.println(details.containsValue("Sai"));
    System.out.println(details.containsValue("Arjun"));

    System.out.println("_____________________________________");
    System.out.println(details.remove(102));
    System.out.println(details);
    System.out.println(details.containsKey(102));
    System.out.println(details.size());
    System.out.println("_________________________________________");

    System.out.println(details.keySet());

    System.out.println(details.values());

    System.out.println(details.entrySet());

    for(Integer key : details.keySet()){
        System.out.println(key);
    }
    for(Map.Entry<Integer, String> entry : details.entrySet()){
       
        System.out.println(entry.getKey());
        System.out.println(entry.getValue());
    }
     System.out.println("______________________________________________");
    Map<Integer, String> students = new HashMap<>();
    students.put(101,"Sai");
    students.put(102, "Sai");
    students.put(103,"Kiran");
    students.put(104, "Kiran");
    System.out.println(students);

    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

    Map<Integer, String> map = new LinkedHashMap<>();
    map.put(103,"Kiran");
    map.put(101, "Sai");
    map.put(104 ,"Arjun");
    map.put(102,"Rahul");
    System.out.println(map);


    System.out.println(" ");
    System.out.println(" ");

    // Map<Integer, String> insert = new TreeMap<>();
    // insert.put(50,"A");
    // insert.put(20,"B");
    // insert.put(40,"C");
    // insert.put(10,"D");
    // insert.put(30,"E");
    // System.out.println(insert);


     Map<Integer, String> insert = new TreeMap<>();
    insert.put(50,"Sai");
    insert.put(20,"Rahul");
    insert.put(40,"Kiran");
    insert.put(10,"Arjun");
    insert.put(30,"Kiran");
    System.out.println(insert);
    
  }
  
}
