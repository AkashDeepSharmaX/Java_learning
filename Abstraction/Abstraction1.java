abstract class car{
    abstract void topSpeedOfCar();
    public void wheel(){
        System.out.println(" have four wheel");
    }

}
class Suzuki extends car {
    @Override
    public void topSpeedOfCar() {
        System.out.println("Speed of Suzuki: 100 mph");
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        Suzuki suzu=new Suzuki();
        suzu.topSpeedOfCar();
        suzu.wheel();   
    }
    
}
