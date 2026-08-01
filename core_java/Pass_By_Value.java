public class Pass_By_Value {

    public static void Modifying_value(int n) {
        n +=1;
        System.out.println("Inside value " + n);
    }

    public static void main(String arg[]) {
        int n = 10;
        System.out.println("Withot any passing  value to the method = " + n);//this  shows the value which is assigned to the 'n' integer

//    Pass_By_Value passByValue=new Pass_By_Value();

        Modifying_value(n);//this  will give the new value  updated value which is copied from the stack
        System.out.println("after method = "+n );// this  will give hte actual value  which is store in the memory
    }
}
