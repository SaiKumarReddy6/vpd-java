
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class files {
  public static void main(String[] args) {
    File f = new File("Student.txt");
   try {
       f.createNewFile();
   } catch (IOException e) {
    System.out.println(e.getMessage());
   }
   
   System.out.println(f.getName());
   System.out.println(f.getAbsoluteFile());
   System.out.println(f.length());
   System.out.println(f.delete());
   System.out.println(f.exists());
    


   Path p =  Path.of("Student.txt");
   System.out.println(p);
   try {
       Files.createFile(p);
       
   } catch (IOException e) {
    System.out.println(e.getMessage());
   }
  System.out.println( Files.exists(p));
  try{
      Files.write(p, "Hello this is sai Kumar reddy".getBytes());
      Files.writeString(p, "\nwelcome to java programming Language",StandardOpenOption.APPEND);
      String read = Files.readString(p);
      System.out.println(read);
      List<String> all = Files.readAllLines(p);
      System.out.println(all);
  }catch(IOException e){
     System.out.println(e.getMessage());
  }
  try(FileReader reader = new FileReader(f);
         BufferedReader br = new BufferedReader(reader);) {
      
      String holder;
      while(( holder = br.readLine()) != null){
         
          System.out.println(holder);
      }
  } catch (IOException e) {
    System.out.println(e.getMessage());
  }
  try{
      FileWriter fw = new FileWriter(f);
      fw.write("hello java");
      fw.close();
  }catch(IOException e){
    System.out.println(e.getMessage());

  }

  
  }
}
