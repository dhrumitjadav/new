import java.util.Scanner;

public class BasicCalcP2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number:");
        double n1=s.nextDouble();
        System.out.println("Enter second number:");
        double n2=s.nextDouble();
        System.out.println("Enter +,-,*,/");
        char o=s.next().charAt(0);
        double n;
        switch(o){
            case '+':
                n=n1+n2;
                System.out.println("The sum of "+n1+" and "+n2+" is "+n);
                break;
            case '-':
                n=n1-n2;
                System.out.println("The difference of "+n1+" and "+n2+" is "+n);
                break;
            case '*':
                n=n1*n2;
                System.out.println("The product of "+n1+" and "+n2+" is "+n);
                break;
            case '/':
                if(n2!=0){
                    n=n1/n2;
                    System.out.println("The quotient of "+n1+" divided by "+n2+" is "+n);
                }else
                    System.out.println("Invalid Division");
                break;
            default:
                System.out.println("Enter valid operations from +,-,*,/");
        }
    }
}
