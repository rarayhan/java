
import java.util.Scanner;


public class Array1 {
    public static void main(String[] args) {
        
        
        int [] num=new int[3];
        
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter first value");
        num[0]=input.nextInt();
         System.out.println("Please Enter second value");
        num[1]=input.nextInt();
         System.out.println("Please Enter third value");
        num[2]=input.nextInt();
        
        int sum=0;
         sum=num[2]+num[1]+num[0];
       double average=sum/num.length;
         
        
        System.out.println(sum);
        int c=num.length;
        System.out.println(c);
        System.out.println(average);
    }
    
    
}
