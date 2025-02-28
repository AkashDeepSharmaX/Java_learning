public class SearchArray {
    public static  void main (String[]args){
        int [] array= new int[]{14,15,16,17,18};
        int sec= 117;
        for (int i=0; i<array.length; i++ ) {
            if (array[i]==sec){
                System.out.println("get the no"+array[i]);

            }
            else{
                System.out.println("not found!!!");
            }
            
        } 
    }
    
}
