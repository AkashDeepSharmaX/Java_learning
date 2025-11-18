public class Invertepyramid{
    public static void main (String []args){
        System.out.println("Printing Inverted half pyramid");
        // outer loop is  decreasing the count 
        for(int i=5; i>=1; i--){
            // inner loop is  in the 
            for(int j=1; j<=i; j++){
                System.out.print("*");
            } 
            System.out.println("");
            }
    }

}