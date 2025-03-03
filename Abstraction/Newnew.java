public class Newnew{
    public static void main (String args[]){
        double a=0.1;
        double b =0.2;
        double c = 0.3;
        System.out.println(a+b==c);
    }
}
// this will print false because  when we add  a ad b  the result is not exactly 0.3  due to precision issue a+b =0.300000004
// something like this  but not exactly 0.3 hence it print false 