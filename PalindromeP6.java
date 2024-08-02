import java.util.Scanner;

public class PalindromeP6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to check its palindrome or not:");
        int n=s.nextInt();
        int p=0,temp=0,r=n;
        while(r>0){
            temp=r%10;
            r=r/10;
            p=(p*10)+temp;
        }
        System.out.println("The reverse of "+n+" is "+p);
        if (n==p) {
            System.out.println("The "+n+" is palindrome number");            
        }
        else{
            System.out.println("The "+n+" is not palindrome number");       
        }
    }
}
