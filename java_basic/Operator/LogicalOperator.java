
public class LogicalOperator {

    public static void main(String[] args) {
        System.out.println("-------------------------------------");
        System.out.println("Using logical operator ");
        System.out.println("______________________");
        int a = 8;
        int b = 3;
        boolean andOperator = (a < b) && (a >= b);
        System.out.println("using the AND operator "+andOperator);
        System.out.println("______________________");


        boolean orOperator = (a > b) || (a <= b);
        System.out.println("using the OR operator "+orOperator);
        System.out.println("______________________");
        boolean notoperator = (a > b);
        System.out.println("using the OR operator "+notoperator);
        System.out.println("-------------------------------------");



    }

    }
