package stringsjava;

public class normailize {
  
  public static String normalize(String name){
    String words = name.trim();
    return words.replaceAll("\\s+", " ");
  }
  public static void main(String[] args){
    String name = "   Hello    This    is   Sai    Kumar ";
    String result = normalize(name);
    System.out.println("Normalized string: " + result);
  }
}
