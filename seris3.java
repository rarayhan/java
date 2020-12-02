
import java.util.Scanner;



public class seris3 {
    
    
    public static void main(String[] args) {
        
        
        
        float a,b,sum = 0;
        
        Scanner input=new Scanner(System.in);
        b=input.nextFloat();
        for(a=(float) 1.5;a<=b;a=(float) (a+1.5)){
   
           sum=sum+a;
           
            
        }
        
        System.out.println(sum);
    }
}
