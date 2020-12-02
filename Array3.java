
import java.util.*;

public class Array3 {

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
        double sum = 0;
        for (int j = 0; j < num.length; j++) {

            sum = sum + num[j];
        }
        System.out.println("The sum is:  " + sum);

        double avg = sum / num.length;
        System.out.println("The Average is: " + avg);
        
        double max=num[0];
        for (int j = 0; j <num.length; j++) {
            if (max<num[j]) {
                max=num[j];
                
            }
            
        }
        System.out.println("The max is "+max);
        
        
        double min=num[0];
        for (int j = 0; j <num.length; j++) {
            if (min>num[j]) {
                min=num[j];
                
            }
            
        }
        System.out.println("The minimum is   " +min);
        
    }
}
