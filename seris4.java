
import java.util.Scanner;



public class seris4 {
   
    public static void main(String[] args) {
        
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your value of n");
        int n=input.nextInt();
        int a;
        int sum=1;
         for(a=1;a<=n;a++){
         
        sum=sum*a;
         
        
         }
           System.out.println(sum);

    }
}
