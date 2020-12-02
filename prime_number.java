
import java.util.Scanner;


public class prime_number {
    public static void main(String[] args) {
        
        int m,n;
      int i=0;
      
      Scanner input=new Scanner(System.in);
        System.out.println("ENter the value");
        m=input.nextInt();
        for(n=2;n<m;n++){
        if(m%n==0){
        
        i++;
        break;
        }
        
        }
        if(i==0){System.out.println("Prime nU,ber");} 
        else{System.out.println("Not prime number");}
    }
    
    
}
