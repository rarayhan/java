
import java.util.Scanner;

public class palindrome_number {

    public static void main(String[] args) {

        int r, sum = 0, temp, n;
        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        temp = n;

        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;

        }

        if (sum == n) {
            System.out.println("Palindrome Number");

        } else {
            System.out.println("Not palindrome");
        }

    }
}
