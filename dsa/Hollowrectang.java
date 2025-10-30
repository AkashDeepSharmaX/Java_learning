public class Hollowrectang {
    public static void main (String []arg){
        System.out.println("Printing hollow pattern");
            // for loop for outer  row iteration
        for (int i=1; i<=5; i++){
            for (int j=1; j<=7; j++){
                // if any of them is correct print the stars
                if(i==1 || j==1 || i==5|| j==7){
                    System.out.print("*");
                }
                // else print blanks spaces 
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
