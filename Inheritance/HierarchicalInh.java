class Animal{
    public void canSee(){
        System.out.println("Animals can See");
    } 
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("cat Meow");
    }
}
class Dog extends Animal{
    public void  makeSounds(){
        System.out.println("Dog Barks");
    }

}
public class HierarchicalInh{
public static void main (String args []){
    Cat cat =new Cat();
    cat.canSee();
    cat.makeSound();
    Dog dog = new Dog();
    dog.canSee();
    dog.makeSounds();

}
}