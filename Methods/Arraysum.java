public class Arraysum{
public void arraySum(int arr[]){
    int sum =0;
    for (int i = 0; i <=arr.length; i++){
        sum= sum +arr[i];
        System.out.println("sum of your array is :" +sum);
    }
    
}
    public static void main(String[] args) {
        Arraysum arraysum =new Arraysum();
        int non[]={1,2,3,4,5,6};
        arraysum.arraySum(non);

    }
}