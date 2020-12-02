
import java.util.Scanner;


public class sum_of_digits {
    public static void main(String[] args) {
        int sum=0,n,r=0;
        int temp;
       
        Scanner input=new Scanner(System.in);
        
        n=input.nextInt();
        

         temp=n;
        while(temp!=0){
        
        r=temp%10;
        
         sum=sum+r;
         temp=temp/10;
            
        
        }
        
        System.out.println(sum);
    }
    
}
