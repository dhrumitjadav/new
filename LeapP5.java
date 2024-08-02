
import java.util.Scanner;

public class LeapP5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a year to check whether it is leap or not:");
        int year=s.nextInt();
        if(year%4==0){
            if(year%100!=0)
                System.out.println("It is a Leap Year");
            else{
                if(year%400==0)
                    System.out.println("It is a Leap Year");
                else
                    System.out.println("It is not a Leap Year");
            }
        }
        else
            System.out.println("It is not a Leap Year");
    }
}
