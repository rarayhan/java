
import java.util.Scanner;



public class seris6 {
  
    public static void main(String[] args) {
        float a;
       float n,sum=1;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(a=(float) 1.5;a<=n;a++){
        
        sum= (sum*a);
        
        
        }
        
        System.out.println(sum);
    }
    
}
