
import java.util.Scanner;


public class pattern1 {
    public static void main(String[] args) {
        int col,row;
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the value of coloum");
        col=input.nextInt();
        
        
        for (int i = 0; i < col; i++) {
            
            for (int j = 1; j <= i; j++) {
                
                System.out.print(j);
            }
            System.out.println("");
        }
        
    }
 
    
    
    
    
    
    
    
    
    
}
