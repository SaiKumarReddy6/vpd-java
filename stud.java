
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class stud implements Comparable<stud>{
  private String name;
  private int marks;

  public stud(String name,int marks){
    this.name = name;
    this.marks = marks;
  }

  public String getName(){
    return name;
  }
  @Override
  public int compareTo(stud other){
    if(this.marks == other.marks){
      return 0;
    }else if(this.marks< other.marks){
      return -1;
    }else{
      return 1;
    }
  }
  public String toString(){
    return name + " -> " + marks;
  }
  static Comparator<stud> byname = new Comparator<stud>(){
    @Override
    public int compare(stud s1, stud s2){
      return s1.getName().compareTo(s2.getName());
      
    
    }
    
  };
  public static void main(String[] args) {
    stud s1 = new stud("Sai",89);
    stud s2 = new stud("Rahul", 78);
    stud s3 = new stud("kiran", 67);
    
    ArrayList<stud> s = new ArrayList<>();
    s.add(s1);
    s.add(s2);
    s.add(s3);
    System.out.println(s);
    Collections.sort(s, byname);
    System.out.println(s);
  }
}
