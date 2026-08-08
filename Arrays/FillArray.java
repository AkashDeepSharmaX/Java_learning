import java.util.Arrays;
public class FillArray {

    public static void main(String[] args) {
        int array1[] = new int[5];
        Arrays.fill(array1, 10);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }

}
