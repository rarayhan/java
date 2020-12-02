public class String2 {
    public static void main(String[] args) {
        
        String a="1";
        String b="Hello";
        String c="hi";
        String l="fgh";
        String d=a+b;
        
        System.out.println(a.concat(b));
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.endsWith(d));
        System.out.println(a.getBytes());
        System.out.println(a.toUpperCase());
        
        String[] n={"k","tyu","ty","rtytr"};
        
        for (int i = 0; i <n.length; i++) {
            System.out.println(n[i]); 
        }
       
        
        for(String x: n){
        
            System.out.printf(x);
        }}
}
