import java.util.Scanner;
public class ReverseTable {
    public static void main (String []arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit for the reverse table generation");
        int m = sc.nextInt();
        if(m>1000){
            System.out.println("You are not allow to for the etering value over 1000 ");
        }
      else{
            for(int n =10; n>=1; n--){
                System.out.println(m +" X "+n +" = "+m*n);
            }
        }
        System.out.println("Thank You!");
    }
    
}
