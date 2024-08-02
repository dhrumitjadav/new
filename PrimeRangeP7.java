import java.util.Scanner;

public class PrimeRangeP7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = s.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = s.nextInt();

        System.out.println("Prime numbers between givven range are:");

        for (int i = start; i <= end; i++) {
            int count = 0;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count==0 ) {
                System.out.print(i + ", ");
            }
        }
    }
}