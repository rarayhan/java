
import java.util.Scanner;



public class seris1 {
    
    
    public static void main(String[] args) {
        
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the value of n"); 
        
        int n=input.nextInt();
        int a,sum=0;
        for(a=1;a<=n;a++){
        
        
        sum=sum+a*a;
            
        }
        System.out.println(sum);
    }
}
