
import java.util.Scanner;

public class Recursion {
    public int Sum(int k){
        if (k>0){
            return k+Sum(k-1);
        }
        else{
            return 0;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value ");
        int k=sc.nextInt();
         Recursion recursion= new Recursion();
        System.out.println(recursion.Sum(k));
    }
    
}
