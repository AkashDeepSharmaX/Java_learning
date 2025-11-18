import java.util.Scanner;
public class ReverseNatural_no {
    public static void main (String []args){
        System.out.println(" Printing reverse Ntural number -");
        Scanner sc =new Scanner(System.in );
        System.out.println("enter the starting natural no: ");
        int m= sc.nextInt();
        System.out.println("Enter the ending natural no: ");
        int n= sc.nextInt();
         if (m<n){
            System.out.println("Starting no cant be less thsn last no ");
         } 
         else{
            while(m>=n){
                System.out.println(m);
                m--;
            }   
         }


    }
}
