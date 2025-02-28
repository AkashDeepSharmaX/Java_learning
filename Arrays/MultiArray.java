

public class MultiArray {
    public static void main(String[] args) {
        
    // declarig 2d array
    int[][] array = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
   // ACCCESSING ELEMENT
    int num =array[1][1];
    System.out.println(num);
    // modifying elements of array
    array[1][1]=10;
    System.out.println(array[1][1]);
    //traversal of array
    for (int i = 0; i < array.length; i++) { 
        for (int j = 0; j < array[i].length; j++) { 
            System.out.print(array[i][j] + " ");
        }
        System.out.println(); 
    }
    
}}