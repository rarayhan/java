
import java.util.ArrayList;
import java.util.Iterator;

public class arraylist1 {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(2);
        num.add(3); 
        num.add(23); 
        num.add(33); 
        num.add(5); 
        num.add(98); 
        num.add(34); 
        num.add(12); 
        num.add(23); 
        num.add(43); 
  
            System.out.println(num);
            System.out.println(num.size());
            
            for(int x: num){
                System.out.println(x);

                num.remove(3);
                System.out.println(num);
                
                
                
                
            }
    }
}
