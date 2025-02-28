
import java.util.Scanner;

public class  Newencap{
    Scanner sc = new  Scanner(System.in);
    public String getInput(String value){
        System.out.println(value);
        return sc.nextLine();
    }
    public static void main(String args[]) {
        Encap encap=new Encap();
        Newencap newencap=new  Newencap();

      encap.setUsername(newencap.getInput("Enter the Username : "));  

        encap.setPassword(newencap.getInput("Enter the Password : "));
        encap.setAge(newencap.getInput("Enter the Age : "));
     System.out.println(encap.getUsername()+" "+encap.getPassword()+" "+encap.getAge());    
    }
}
