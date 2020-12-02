
import java.util.Scanner;


public class seris7 {
  
    public static void main(String[] args) {
        System.out.println("Enter your Number");
        Scanner input=new Scanner(System.in);
        int n;
        n=input.nextInt();
        int a;
        int sum=1;
        
        for(a=1;a<=n;a++){
        
        sum=sum*a*a;
        
        
        }
        System.out.println(sum);
    }
 
    
}
