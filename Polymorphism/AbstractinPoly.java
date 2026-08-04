abstract class Animal{
     abstract void sound();
}
class Cow extends Animal{
    public void sound(){
        System.out.println("Cow Moo");
    }
}
class Elephant extends Animal {
    void sound() {
        System.out.println("Elephant trumpets");
    }
}
public class AbstractinPoly{
public  static void main (String args[]){

    Animal a;
    a=new Cow();
    a.sound();
    a=new Elephant();
    a.sound();
}
}
