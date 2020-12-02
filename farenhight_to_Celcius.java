
import java.util.Scanner;


public class farenhight_to_Celcius {
    public static void main(String[] args) {
        
        double c,f;
        
         Scanner input=new Scanner(System.in);
         
        System.out.println("Enter the temperature in Farenhight");
        f=input.nextDouble();
        c=(f-32)*5/9;
        System.out.printf(" The TEmparature is %f C",c);
        
    }
    }
 
    
    
    
    
    

