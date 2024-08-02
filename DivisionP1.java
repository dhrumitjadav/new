import java.util.Scanner;

public class DivisionP1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter marks in all the 5 subjects:");
        double m1=s.nextDouble();
        double m2=s.nextDouble();
        double m3=s.nextDouble();
        double m4=s.nextDouble();
        double m5=s.nextDouble();
        double p=((m1+m2+m3+m4+m5)/500)*100;

        if(p>=60)
            System.out.println("First Division");
        else if(p<60 && p>=50)
            System.out.println("Second Division");
        else if(p<50 && p>=40)
            System.out.println("Third Division");
        else
            System.out.println("Fail");
    }
}
