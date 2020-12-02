
import java.util.*;


public class array4 {
    public static void main(String[] args) {
        
        ArrayList<Integer> num=new ArrayList<>();
        
        System.out.println(num.size());
        
        num.add(90);
        num.add(909);
         num.add(9);
          num.add(0);
           num.add(10);
            num.add(-90);
             num.add(20);
              num.add(30);
               num.add(40);
                num.add(50);
                 num.add(60);
                  num.add(70);
                  
                
               
              
             
   
     
        System.out.println(num);
        
        for (int i: num) {
            System.out.println(num);
        
            System.out.println("ArrayList is "+num.isEmpty());
            System.out.println(num.contains(3));
            System.out.println(num.get(0));
            System.out.println(num.indexOf(90));
            Collections.sort(num);
            System.out.println(num);
            Collections.sort(num,Collections.reverseOrder());
            System.out.println(num);
            System.out.println("HI");
        }
        
        
       
        
    }
    
    
    
    
}
