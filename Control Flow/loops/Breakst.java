public class Breakst {
        public static void main(String[] args) {
            int i = 0;
            while (i <= 10) {
                System.out.println("doing " + i);
               
    
                if (i == 8) {
                     // This will display when `i` is 8
                    System.out.println("hey break");
                    break; 
                    
                }
                i++;
            }
        }
    }
