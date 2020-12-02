
import java.util.*;

public class string1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of A String ");
        String a = input.nextLine();
        System.out.println("Enter the value of B string ");
        String b = input.nextLine();

        System.out.println(a + " " + b);
        System.out.println(a.length());
        System.out.println(b.length());

        if (a.equalsIgnoreCase(b)) {
            System.out.println("Equals");

        } else {

            System.out.println("Not equal");

        }

        if (a.isEmpty()) {
            System.out.println("Emoty");

        }

        input.close();
    }

}
