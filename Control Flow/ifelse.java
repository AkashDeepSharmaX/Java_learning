import java.util.Scanner;

public class ifelse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("given no is even " + a);
        } else {
            System.out.println("given no is odd " + a);
        }
    }
}
