// interace declared 
interface Testinterface {
    final int a =10;
    // abstract or public method
    void display();
    
}
class Testclass implements Testinterface{
    // implements the capabilites of inerface 
    public void display(){
        System.out.println("hello long time no see ");

    }

}
class Test{
    public static void main(String[] args) {
        Testclass t=new Testclass();
        t.display();
        System.out.println(Testinterface.a);
    }
}
