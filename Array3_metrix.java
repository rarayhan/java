
import java.util.Scanner;


public class Array3_metrix {
        
    public static void main(String[] args) {
       int num[][]=new int [4][4];
      
       
      Scanner input=new Scanner(System.in);
        for (int row = 0; row <4; row++) {
            for (int col = 0; col <row+1; col++) {
                num[row][col]=input.nextInt();
                
            }
        }
        
        
         for (int row = 0; row <4; row++) {
            for (int col = 0; col < row+1; col++) {
                System.out.print("  "+num[row][col]);
                
            }System.out.println();
        }
    }




    
}
