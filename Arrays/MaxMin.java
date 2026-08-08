

public class MaxMin {

    public static void main(String[] args) {
        int[] maxi = {1, 2, 36, 25, 56, 85, 3, 5};
        int[] mini = {19, 29, 36, 5, 56, 85, 3, 75};
        int max = 0;
        int min = mini[0];
        for (int i = 0; i < maxi.length; i++) {
            if (maxi[i] > max) {
                max = maxi[i];
            }
        }
        System.out.println("maximum value " + max);
        for (int i = 0; i < mini.length; i++) {
            if (mini[i]<min ){
            min =mini[i];
            }
        }
System.out.println("minimum value"+min);
    }

}
