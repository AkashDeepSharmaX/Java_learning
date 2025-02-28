class Animal{
    public void makeSound(){
        System.out.println("Animal make sounds");
    }}
    class Pig extends Animal{
        public void makeSound(){
            System.out.println("Pig OINK");
        }
    }
    class Dog extends Animal{
        public void makeSound(){
            System.out.println("Dog Bark");
        }
    }
public class PolyEg{
    public static void main(String [] args){
        // Animal ani=new Animal();
        // Pig pig= new Pig();
        // Dog dog=new Dog();
        // ani.makeSound();
        // pig.makeSound();
        // dog.makeSound();     
        // dog.makeSound();
        Animal animal =new Animal();
        animal.makeSound();
        animal=new Dog();
        animal.makeSound();
        animal= new Pig();
        animal.makeSound();


    }
}