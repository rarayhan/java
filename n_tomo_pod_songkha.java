
import java.util.Scanner;

public class n_tomo_pod_songkha {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter The value of N");
        int n = input.nextInt();
        int a = input.nextInt();
        int d = input.nextInt();
        int r = a + (n - 1) * d;
        System.out.println(r);

    }
}
