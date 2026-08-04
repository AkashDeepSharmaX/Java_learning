public class TypeConversion {
    public static void main (String []args){
        System.out.println("implicit automatic done by compiler");
        int a =10;
        long b=a;
        System.out.println(b);
        System.out.println("explicit done by manually");
        float f = 10.5663f;
        int s =(int) f;
        System.out.println(s);
    }
    
}
