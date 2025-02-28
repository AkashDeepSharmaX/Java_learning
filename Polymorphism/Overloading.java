class Math{
    public int multiplyTwo( int a, int b){
        return a*b;
    }
    public double multiplyTwo( double  a, double b){
        return a*b;
    }
    public int multiplyTwo( int a, int b, int c){
        return a*b*c;
    }
}
public class Overloading {    
    public static void main(String[] args) {
        Math math=new Math();
System.out.println(math.multiplyTwo(5, 5));
    System.out.println(math.multiplyTwo(4.5, 5.4));
System.out.println(math.multiplyTwo(4, 2, 5));

    }
  }
    

