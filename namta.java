
import java.util.Scanner;

public class namta {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int a, sum = 1;
        for (a = 1; a <= 10; a++) {
            sum = a * n;
            System.out.print(a + "x" + n);
            System.out.println(" is  " + sum);

        }

    }
}
