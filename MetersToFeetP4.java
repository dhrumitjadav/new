import java.util.Scanner;

public class MetersToFeetP4 {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter distance in meters:");
    double m=s.nextDouble();
    double f=m*3.28;
    System.out.println("Distance in meters is "+m+" and distance in feet is "+f);
   } 
}