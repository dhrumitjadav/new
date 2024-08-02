import java.util.Scanner;

public class VowelConsonantP5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a letter:");
        char a=s.next().charAt(0);
        if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
            System.out.println(a+" is a vowel");
        else
            System.out.println(a+" is a consonant");   
    }
}