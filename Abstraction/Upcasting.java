class Remote{

public void powerBUtton(){
System.out.println("remote have PowerOff and PowerOn button");
}
}
class sony extends Remote{
    public void navigationButton(){
        System.out.println("sony Remate have Navigation buttons");
}}
public class Upcasting{
    public static void main (String[] arg ){
        Remote remote= new sony();
        remote.navigationButton();
        remote.powerBUtton();

    }
}