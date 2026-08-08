class Animal{
    public void canSee(){
        System.out.println("Animal Can see");
    }
}
class dog extends Animal{
    public void makeSound(){
        super.canSee();
        System.out.println("dog bark");
    }
}


class SuperInh{
    public static void main(String[] args) {
        dog obj = new dog();
        obj.makeSound();       
    }
}