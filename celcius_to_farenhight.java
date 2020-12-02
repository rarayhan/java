
import java.util.Scanner;

public class celcius_to_farenhight {

    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 if you want to convert C>F");
        System.out.println("Enter 2 if you want to convert f>C");
        a = input.nextInt();

        if (a == 1) {
            System.out.println("enter the value of C");
            double c = input.nextDouble();
            double f = (1.8 * c) + 32;
            System.out.println("the temp in F scale is = " + f);
            f = 0;
            c = 0;

        }
        if (a == 2) {
            System.out.println(" enter the value of F ");
            double f = input.nextDouble();
            double c = (0.555555555556) * (f - 32);
            System.out.println("The temp in c scale is =" + c);

        }
        input.close();

    }

}
