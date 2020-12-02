
import java.util.Scanner;


public class VIRNIER_SCALE {
    public static void main(String[] args) {
        
      long l,v;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of L");
        l= input.nextLong();
        System.out.println("Enter the vlaue of V");
        v=input.nextLong();
        System.out.println("Enter the vlaue of Vc");
         float vc=input.nextFloat();
         
         double sum= (l+v*vc);
         System.out.println(sum);
    }
  
}
