
import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {

        double[] a = new double[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any 4 number");
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextDouble();

        }

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];

        }
        System.out.println(sum);

        double avg = sum / a.length;
        System.out.println(avg);

    }

}
