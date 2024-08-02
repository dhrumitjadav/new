import java.util.Scanner;

public class ConsonantsVowelP1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string to check the number of vowels and consonants in it:");
        String str=s.nextLine();
        int vowels=0,consonants=0;
        char a;
        for(int i=0;i<str.length();i++){
            a=str.charAt(i);
            if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
                vowels++;
            else if((a>=97 && a<=122)||(a>=65 && a<=90))
                consonants++;
        }
        System.out.println("The number of vowels is "+vowels+" and the number of consonants is "+consonants);
    }
}
