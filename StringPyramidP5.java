import java.util.Scanner;

public class StringPyramidP5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string to print it in pyramid:");
        String str=s.nextLine();
        for(int i=1;i<=str.length();i++)
            System.out.println(str.substring(0, i));
    }
}
