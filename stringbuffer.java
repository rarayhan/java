



public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Rayhan");
 
        System.out.println(sb);
       sb.append(" Ahmed");
               
        System.out.println("Reverse: " +sb.reverse());
        System.out.println("Delete:"+sb.delete(0, 1));
        sb.setLength(5);
        System.out.println("lenth:"+sb);

    }
}
