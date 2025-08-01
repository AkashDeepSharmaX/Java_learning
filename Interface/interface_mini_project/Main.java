package interface_mini_project;

public class main {
    public static void main(String[] args) {
        Appliance fan = new Fan();
        Appliance light = new Light();
        Appliance projector =new Projector();
         fan.on();
         fan.off();
         light.on();
         light.off();
         projector.on();
         projector.off();

    }
    
}
