interface Car{
 void haveWheels();
 void havebrakes();

}
class Bmw implements Car{
    @Override
    public void haveWheels(){
        System.out.println("have 4 wheels");
    }
    @Override
    public  void havebrakes(){
        System.out.println("have brakes ");
    }
}
public class Interface1{
    public static void main(String args[]){
Car car;
car=new Bmw();
car.havebrakes();
car.haveWheels();

}}