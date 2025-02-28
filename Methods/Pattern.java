
public class Pattern {
    public void patternOne(int n){
        for (int i = 0; i < n; i++) {
            for(int j=0;j<i+1;-j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
     public static void main(String[] arg) {
    //   Scanner var1 = new Scanner(System.in);
    //   System.out.println("enter the value ");
    //   int var2 = var1.nextInt();    
      Pattern pattern = new Pattern();
      pattern.patternOne(5);
      
     }
}
