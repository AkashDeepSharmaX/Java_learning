public class Halfpyramid {
    public static void main(String []args){
 // Outer loop controls rows vertical iteration         
        for (int i=0;i<6; i++){           
   // Inner loop controls columns horizontal iteration
         for(int j=0; j<=i ; j++){
            System.out.print("*");
       }
 // Move to the next line after each row
        System.out.println();
        }
    }
    
}
