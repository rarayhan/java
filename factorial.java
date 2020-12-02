
import java.util.Scanner;


public class factorial {
  
    
    public static void main(String[] args) {
        
        long a;
        long n;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=input.nextInt();
        
       long sum=1;
        for(a=n;a>=1;a--){
        sum=sum*a;
        
        
        }
        System.out.println(sum);
        
    }
}
