

public class BitwiseOperator {
    public static void main(String[] args) {
        System.out.println("-------------------------------------");
        System.out.println("Using bitwise operators ");
        int a =8;
        int b =2;
        int andresult = a&b;
        System.out.println("Using AND operator "+andresult);

        int orresult = a|b;
        System.out.println("Using OR operator "+orresult);
        int xorresult = a^b;
        System.out.println("Using XOR  operator "+xorresult);
        int compresult = ~a;
        System.out.println("Using  Bitwise complement operator "+compresult);
        int leftshiftresult = a<<2;
        System.out.println("Using left shift  operator "+leftshiftresult);
        int righttshiftresult = a>>2;
        System.out.println("Using right shift  operator "+righttshiftresult);
        int unsignrigtshift = b>>>2;
        System.out.println("using unsignd right shift operator :"+unsignrigtshift);


    }
    
}
