import java.util.Scanner;

public class ArrayRevP3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of your array:");
        int size=s.nextInt();
        int[] a=new int[size];
        System.out.println("Enter the elements of your array:");
        for(int i=0;i<size;i++)
            a[i]=s.nextInt();
        System.out.println("The array in reverse is:");
        for(int i=size-1;i>=0;i--)
            System.out.print(a[i]+" ");
    }
}