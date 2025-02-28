class Superclass{  
    public void SuperMethod(){
        System.out.println("This is superclass method");
    }
}
    class Subclass extends Superclass{
        @Override
        public void SuperMethod(){
            System.out.println("This is Subclass method ");
        }
    }

public class First{
public static void main (String args[]){
Subclass obj = new  Subclass();
    obj.SuperMethod();


}    
}