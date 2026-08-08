
class Pass_By_Value {

    String name;

    // Primitive: pass-by-value
    public static void modifyValue(int num) {
        num += 5;
        System.out.println("Inside method: num = " + num);
    }

    // Object: reference value is passed by value
    public static void change(Pass_By_Value passByValue) {
        passByValue.name = "noob";

        System.out.println("Inside method: name = "
                + passByValue.name);
    }

    public static void main(String[] args) {

        // -------------------------
        // 1. PRIMITIVE
        // -------------------------

        int n = 10;

        System.out.println("Before method: n = " + n);

        modifyValue(n);

        System.out.println("After method: n = " + n);


        // -------------------------
        // 2. OBJECT
        // -------------------------

        Pass_By_Value s = new Pass_By_Value();

        s.name = "proo";

        System.out.println("\nBefore method: s.name = " + s.name);

        change(s);

        System.out.println("After method: s.name = " + s.name);
    }
}

