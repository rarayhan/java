
import java.util.Scanner;


public class amastrong_number {
     public static void main(String[] args) {
        int sum = 0,r,temp,n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        
        
        temp=n;
        while (temp!=0) {
            r=temp%10;
            sum=r*r*r+sum;
            temp=temp/10;
            
            
             
         }
        
         if (sum==n) {
             System.out.println("Amstrong number");
             
         }
         else{
             System.out.println("Not Amstrong number");
         
         }
    }
    
    
    
    
    
    
    
}
