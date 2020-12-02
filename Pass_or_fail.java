
import java.util.Scanner;


public class Pass_or_fail {
    
   
    
    public static void main(String[] args) {
        
        
        double a;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter youre Number");
        a=input.nextInt();
                
        if(a>=33 && a<=100 ){
            System.out.println("Congratulation, You have passed in the exam");
        
        }
        else if (a>=100 || a<=0 ){
        System.err.println("Not a Valid number");
        
        }    
        
        else{
        
            System.out.println("You failed");
        }
    }
    
    
    
    
    
}
