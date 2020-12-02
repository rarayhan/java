
public class string_palindrom {

    public static void main(String[] args) {
      StringBuffer sv=new StringBuffer("lik");
     StringBuffer sb=sv.reverse();
        if (sv.equals(sb)) {
            System.out.println("Pallindrom ");
            
        }
        
        else{
        
            System.out.println(" Not Pallindrom");
        }
    }

}
