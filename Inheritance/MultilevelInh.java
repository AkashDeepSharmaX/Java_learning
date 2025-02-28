class  GrandParents{
    public void  Gparent(){
        System.out.println("hey! From GrandParents");
    }
}
    class Parent extends  GrandParents{
        public void MsgParents(){
        System.out.println("Hello from parents");
  }
} 
class  Child extends Parent{
    public void MsgChild(){
System.out.println("hello fom children");
    }
}
public class MultilevelInh{
    public static void main (String args[]){
        Child child =new Child();
        child.Gparent();
        child.MsgParents();
        child.MsgChild();
    }
}