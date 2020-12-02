
import java.util.Scanner;

public class dighat_somikoron {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your VAlue of a");
        double a = input.nextInt();
        System.out.println("Enter the value of b");
        double b = input.nextInt();
        System.out.println("Enter the value of c");
        double c = input.nextInt();
        double x1 = (-b + (Math.sqrt((Math.pow(b, 2) - 4 * a * c)))) / 2 * a;

        System.out.println("The VAlue of X1 is " + x1);
        double x2 = (-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / 2 * a;
        System.out.println("The Value of x2 is  " + x2);

    }

}
