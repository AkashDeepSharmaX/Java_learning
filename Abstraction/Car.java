abstract class Car {
    abstract void  startEngine();
}
 class tesla extends Car{
    @Override
    void startEngine(){
        System.out.println("Tesla starts silently");
    }

}
class porsche extends Car{
    @Override
    void startEngine(){
        System.out.println("Porsche starts loudly");
    }
}
