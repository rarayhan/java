
import java.util.Scanner;


public class reverse_a_number {
    
    
    public static void main(String[] args) {
        
        
        int n,sum = 0,temp=0,r;
        
        Scanner input=new Scanner(System.in);
            n=input.nextInt();
            
            temp=n;
            while(temp!=0){
                  r=temp%10;
                  
                  sum=sum*10+r;
                  temp=temp/10;
            
            }
        System.out.println(sum);

    }
}
