public class rightaglStar {
    public static void main(String []args){
 // Outer loop controls rows vertical iteration         
        for (int i=0;i<6; i++){           
   // Inner loop controls columns horizontal iteration
         for(int j=0; j<=i ; j++){
            System.out.print(i+" "+j+"*");
       }
 // Move to the next line after each row
        System.out.println();
        }
    }
    
}
