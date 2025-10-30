public class Rectaglepatt {
    public static void main(String []args){
    System.out.println("Printing rectangle pattern");
    // for loop for outer  row iteration
    for(int i=1;i<=4; i++){
        // for loop for the  columns iteration
        for(int j=1; j<=7; j++){

            System.out.print("*");
        }
        // this line moves to next line after the one row  iteration
        System.out.println("");
    }
    }
    
}
