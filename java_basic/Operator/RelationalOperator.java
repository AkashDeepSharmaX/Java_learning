
public class RelationalOperator {

    public static void main(String[] args) {
        System.out.println("-------------------------------------");
        System.out.println("Using Relational operator ");

        int a = 8;
        int b = 3;
        boolean equaltoop = a == b;
        System.out.println("using Equal to operator  " + equaltoop);
        System.out.println("_________________________");
        boolean notequaltoop = a != b;
        System.out.println("using not Equal to operator " + notequaltoop);
        System.out.println("_________________________");

        boolean greater = a > b;
        System.out.println("using greater than operator " + greater);
        System.out.println("_________________________");

        boolean lessthan = a < b;
        System.out.println("using less  than operator " + lessthan);
        System.out.println("_________________________");

        boolean greaterthanorequalto = a >= b;
        System.out.println("using greater than or equal to  operator " + greaterthanorequalto);
        System.out.println("_________________________");

        boolean lessthanorequalto = a <= b;
        System.out.println("using less than or equal to  operator " + lessthanorequalto);
        System.out.println("-------------------------------------");

    }
}
