public class HalfPyramid {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the half pyramid

        System.out.println("Half Pyramid Pattern:");
        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment (optional, for right-aligned pyramid)
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
