import java.util.Scanner;

public class LargestOf3P3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 3 numbers to find the largest of the three:");
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n3=s.nextInt();
        int n=(n1>=n2 && n1>=n3)?n1:(n2>=n1 && n2>=n3)?n2:n3;
        System.out.println("The largest of the three numbers is "+n);
    }
}