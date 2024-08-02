import java.util.Scanner;

public class ArrayAverageP2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] n=new int[4];
        double sum=0;
        System.out.println("Enter elements of an array:");
        for(int i=0;i<4;i++){
            n[i]=s.nextInt();
            sum+=n[i];
        }
        System.out.println("The average of the total of the elements of an array is "+(double)(sum/4));
    }
}