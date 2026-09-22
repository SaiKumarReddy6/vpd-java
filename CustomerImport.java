import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CustomerImport {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();

        try(FileWriter fw = 
                    new FileWriter("customers.txt")){
                      fw.write("101,Sai Kumar,sai@gmail.com" + 
"\n102,Ravi,ravi@gmail.com" + 
"\n103,Arjun,arjun@gmail.com");
         

        }catch(IOException e){
                 System.out.println(e.getMessage());
        }
        try (BufferedReader br =
                 new BufferedReader(new FileReader("customers.txt"))) {
            
            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String email = data[2];

                Customer customer =
                    new Customer(id, name, email);

                customers.add(customer);
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Invalid customer ID");
        }

        System.out.println("\nImported Customers:");

        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}