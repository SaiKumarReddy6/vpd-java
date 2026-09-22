
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Ticket {
  static Scanner sc = new Scanner(System.in);
  private long ticket_id;
  private String customer_name;
  private String issue;
  private int priority;

  public Ticket( long ticket_id, String customer_name, String issue, int priority){
      this.ticket_id = ticket_id;
      this.customer_name = customer_name;
      this.issue = issue;
      this.priority = priority;
  }

  public long getTicketId(){
    return ticket_id;
  }
  public String getCustomerName(){
    return customer_name;
  }
  public String getIssue(){
    return issue;
  }
  public int getPriority(){
    return priority;
  }
  public String toString(){
      return ticket_id + " "  + customer_name + " " + issue + " " + priority;
    }
  static Comparator<Ticket> byPriority = new Comparator<Ticket>(){
    @Override 
    public int compare(Ticket t1,Ticket t2){
     return Integer.compare(t1.getPriority(),t2.getPriority());
    
    }
  };





  public static void main(String[] args) {
    System.out.println("Enter your name here.............");
    String customer_name = sc.nextLine();
    PriorityQueue<Ticket> t = new PriorityQueue<>(byPriority);
   
    t.add(new Ticket(101, customer_name, "Internet issue", 3));
        t.add(new Ticket(103, customer_name, "Payment issue", 1));
            t.add(new Ticket(102, customer_name, "Account login problem", 2));
      while(!t.isEmpty()){
        System.out.println(t.poll());
      }
      
  }
}
