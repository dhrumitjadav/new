import java.util.Scanner;

public class Primep4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or not: ");
        int n=s.nextInt();
        if(n<=0)
            System.out.println("Invalid number");
        else
        {
            int count=0;
            for(int i=1;i<n/2;i++){
                if(n%i==0)
                    count++;
                    break;
            }
            if(count==0)
                System.out.println("It is a prime number");
            else
                System.out.println("It is not a prime number"); 
        }
    }
}
