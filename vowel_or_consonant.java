
import java.util.Scanner;


public class vowel_or_consonant {
    public static void main(String[] args) {
        char a;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any charecter");
        a=input.next().charAt(0);
        
    if(a=='a'||a=='e'||a=='i'|| a=='o' || a=='u' || a=='A'|| a=='E'|| a=='I'|| a=='O'|| a=='U'){
    
        System.out.println(" It is Vowel");
    }
    else{
    
        System.out.println(" It is consonant");
    }
    }

    
}
