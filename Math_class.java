
public class Math_class {
    
    public static void main(String[] args) {
        int x=-13;
        int y=-45;
        int max=Math.max(x, y);
        System.out.println("max"+max);
        
        int abs=Math.abs(y);
        
        System.out.println("ABS"+abs);
        
        double a=12,b=34;
         double pow;
        pow = Math.pow(a, b);
         
         System.out.println("pow  "+pow);
         
         int hi=Math.multiplyExact(x, y);
         System.out.println("multiply exact"+hi);
         double sqr=Math.sqrt(b);
         System.out.println(sqr);
        
         System.err.println(Math.PI);
         System.out.println(Math.E);
                 
                
    }
}
