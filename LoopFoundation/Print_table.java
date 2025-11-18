import java.util.*;
public class Print_table {
    public static void main (String []args){
        System.out.println("Printing table\n enter the no for the table generation");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if (m>1000){
            System.out.println(" you can't generate table over 1000");
        }
        else {
        for (int n =1; n <=10; n++){
            System.out.println(m +" X "+n +" = "+m*n);
        }
    }
    System.out.println("Thank You!");
    }
    
}
