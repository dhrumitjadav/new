import java.util.Scanner;

public class StringLengthP4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(
                "Enter a string to find out the length of the string and to find the second half of the string:");
        String str = s.nextLine();
        int len = str.length();
        String str1 = str.substring(len / 2);
        System.out.println("The original string is " + str + " whose length is " + len
                + " and the second half of the string is " + str1);
    }
}