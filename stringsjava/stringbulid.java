package stringsjava;

public class stringbulid {
  public static String buildStr(String [] arr){
    StringBuilder sb = new StringBuilder();
    for(int i = 0;i<arr.length;i++){
      if(arr[i]!=null){
        sb.append(arr[i]);
        if(i<arr.length-1){
          sb.append(",  ");
        }
      }
    }
    return sb.toString();
  }
  public static void main(String [] args){
    String [] arr = {"Hello",null,"This","is","Sai","Kumar"};
    String result = buildStr(arr);
    System.out.println("The built string is: " + result);
  }
}
