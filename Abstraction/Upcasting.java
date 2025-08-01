abstract class Remote{
abstract void powerBUtton();
}
class Sony extends Remote{
    @Override
    public  void powerBUtton(){
        System.out.println("remote have PowerOff and PowerOn button");

    }
    public void navigationButton(){
        System.out.println("sony Remate have Navigation buttons");
}}
class Samsung extends Remote{
    @Override
    public void powerBUtton(){
        System.out.println("remote have PowerOff and PowerOn button");
    }
    public void voiceComandFeature(){
        System.out.println("Samsung Remote have voice command feature");
    }
}   

public class Upcasting{
    public static void main (String[] arg ){
        Remote remote; 
        remote= new Sony();
        remote.powerBUtton();
        remote = new Samsung();
        remote.powerBUtton();


    }
}