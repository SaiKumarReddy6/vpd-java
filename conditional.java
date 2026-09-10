import java.util.Random;
import java.util.Scanner;
public class conditional {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Year Of Birth");
    int year_Of_Birth = sc.nextInt();
   System.out.println("enter the mobile-Number");
   long phone_Number = sc.nextLong();
   long mn = phone_Number;
   int otp_Attempt = 0;
   
    if(year_Of_Birth >= 1997 && year_Of_Birth <=2000) {
         System.out.println("please register for your matrimony profile");
        System.out.println("please enter your mobile Number here....");
        long user_Mobile_Number = sc.nextLong();
        if(mn == user_Mobile_Number){
          Random r = new Random();
           System.out.println("we have sent an 4 digit otp pls enter here");
           int otp = r.nextInt(9000) + 1000;
           int verify_user_otp = sc.nextInt();
           if(verify_user_otp==otp){
              System.out.println("Otp is matched...");
           }
           else{
            System.out.println("otp is mismatched wait we will send You new one..");
            while(verify_user_otp != otp && otp_Attempt<=3){
               int newOtp = r.nextInt(9000)+1000;
               System.out.println("please enter the otp that we sent to your registered mobile number");
               int new_User_Otp = sc.nextInt();
               otp_Attempt++;
               if(newOtp == new_User_Otp){
                System.out.println("You have entered correctly");
               }else{
                System.out.println("Otp is mismatched again");
                System.out.println(otp_Attempt + " you have used one of your attempt you are left with 2 more attempts remaining in 3");
               }
               if(otp_Attempt>3){
                System.out.println("You have complteted all your otp attempts for today pls comeback at this time tomorrow. Thank You");
                
               }
               
            }
           }
           
        }else{
          System.out.println("you have entered invalid mobile number please enter valid mobile number...");
        }
    }else{
      System.out.println("you are not eligible to complete the matrimony profile wait untill you turn 25 have a great day their..");
    }
  }
}
