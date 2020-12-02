
import java.util.Scanner;


public class even_or_odd {
   
    public static void main(String[] args) {
        
        int a;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter ANY Number");
        a=input.nextInt();
         if(a%2==0){
             System.out.println("Even");
         }
         else{
             System.out.println("Odd");
         }
    }
    
    
}
