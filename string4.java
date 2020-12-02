
public class string4 {
    
    public static void main(String[] args) {
       
         String a="Hi , M@y name is Good.";
    
         System.out.println(a.replace("i", "l"));
         String []s =a.split("@");
         for(String x: s){
             System.out.println(x);
         
         }
    }

}
