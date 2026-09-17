package stringsjava;

public class palindrome {
  public static boolean isPalindrome(String str){
     String reversed = "";
      for(int i = str.length()-1;i>=0;i--){
        reversed += str.charAt(i);
      }
      boolean isPalin = str.equalsIgnoreCase(reversed);
      return isPalin;
  }
  public static void main(String[] args){
    String str = "Racecar";
    boolean result = isPalindrome(str);
    if(result){
      System.out.println(str + " is a palindrome");
    }else{
      System.out.println(str + " is not a palindrome");
    }
  }
}
