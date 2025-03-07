interface car{
    public void haveEngine();
    public void haveGastank();
}
interface Ev {
    public void  haveBatteries();
    public void haveChargingPort();
}
class Bmw implements car,Ev{
    @Override
    public void haveEngine(){
        System.out.println("bmw cars have Engine ");
    }
    @Override
    public void haveGastank(){
        System.out.println("bmw cars have Gas tank ");

    }
    @Override
    public void  haveBatteries(){
        System.out.println("Bmw ev's have the Bateries");
    }
    @Override
    public void haveChargingPort(){
        System.out.println("bmw Evs have charging ports for their charging ");
    }

}
public class MultipleInh {
    public static  void main(String args[]){
car car;
car=new Bmw();
car.haveEngine();
car.haveGastank();
Ev ev;
ev=new Bmw();
ev.haveBatteries();
ev.haveChargingPort();

    }
}
