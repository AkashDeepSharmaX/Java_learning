public class UnaryOperator {
    public static void main(String[] args) {
        System.out.println("-------------------------------------");
        System.out.println("Using unary operator ");

        int a = 8;
        int b =5;
        int inc = a++;
        System.out.println("Using increment operator"+inc);
        System.out.println(a);
        int dec = b--;
        System.out.println("Using decremet operator "+dec);
        System.out.println(b);
       String ternaryop = (a%2==0)? "even" : "odd";
       System.out.println("using Trnary operator "+ ternaryop);




    }
}
