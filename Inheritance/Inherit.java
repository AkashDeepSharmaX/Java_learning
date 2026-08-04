class Animal{
   public void eat(){
    System.out.println("Animal can eat");
   } 
   public void canSee(){
    System.out.println("Animal can see");
   }
}
class  Dog extends Animal{
    public  void bark(){
        System.out.println("Dogs bark");
    }
}
public  class Inherit{
    public static void main (String args[]){
        Dog mydog = new Dog();
        mydog.eat();
        mydog.canSee();
        mydog.bark();

    }

}