import java.util.Scanner;

public class Natural_no{
    public static void main (String []args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" enter the starting no :");
            int s =sc.nextInt();
            System.out.println(" enter the the last natural no for the ending:");
            int n = sc.nextInt();
if (n<s){
   System.out.println("last no cant be less then ");
 }else{
while(s<=n){  
   System.out.println(s);
s++;
}
 }
        }
    }
}