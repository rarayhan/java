
import java.util.Scanner;





public class seris5 {
    public static void main(String[] args) {
        
         System.out.println("Enter your value of n");
        Scanner input=new Scanner(System.in);
        
      int n=input.nextInt();
      int a;
      int sum=1;
      for(a=1;a<=n;a=a+2){
      
      sum=sum*a;
      
      
      }
        System.out.println(sum);
    }
}
