
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer value");
        int variableint = sc.nextInt();
        System.out.println(variableint);
        System.out.println("enter the float");
        float variablefloat = sc.nextFloat();
        System.out.println(variablefloat);
        System.out.println("enter the char ");
        char variablechar = sc.next().charAt(0);
        System.out.println(variablechar);
        System.out.println("enter true/false");
        boolean variableboolean = sc.nextBoolean();
        System.out.println(variableboolean);

    }

}
