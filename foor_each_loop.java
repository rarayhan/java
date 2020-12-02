
import java.util.Scanner;

public class foor_each_loop {

    public static void main(String[] args) {
        int i;

        Scanner input = new Scanner(System.in);

        System.out.print("How many Array do you want to create?   ");
        i = input.nextInt();

        double[] num = new double[i];

        for (int j = 0; j < num.length; j++) {

            System.out.printf("Enter the %d number   ", j);

            num[j] = input.nextInt();

        }

        System.out.println();
        System.out.println();

        //sum
        double sum = 0;
        for (double x: num) {

            sum = sum +x;
        }
        System.out.println("The sum is:  " + sum);
        // avg
        double avg = sum / num.length;
        System.out.println("The Average is: " + avg);
        //max 
        double max = num[0];
        for (int j = 0; j < num.length; j++) {
            if (max < num[j]) {
                max = num[j];

            }

        }
        System.out.println("The max is " + max);

        //min
        double min = num[0];
        for (int j = 0; j < num.length; j++) {
            if (min > num[j]) {
                min = num[j];

            }

        }
        System.out.println("The minimum is   " + min);

    }

}
