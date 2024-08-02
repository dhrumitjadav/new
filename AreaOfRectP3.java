import java.util.Scanner;

public class AreaOfRectP3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length of the rectangle:");
        double l=s.nextDouble();
        System.out.println("Enter breadth of the rectangle:");
        double b=s.nextDouble();
        System.out.println("The area of rectangle is "+(l*b));
    }
}