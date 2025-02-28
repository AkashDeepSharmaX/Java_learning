public class Moverload{
public int addTwoNo(int x , int y){
    return x+y;
}
public double addTwoNo(float  x , float  y){
    return x+y;
}
public static void main(String[] args) {
    Moverload moverload=new Moverload();
   System.out.println( "hello  "+moverload.addTwoNo(5  , 4));
   System.out.println(moverload.addTwoNo(5.5f, 4.4f));
}
}