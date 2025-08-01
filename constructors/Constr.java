public class Constr {
    int age ;
    String name;
    int rollno ;
    public Constr(int age, String name, int rollno){
        this.age= age ;
         this.name = name ;
         this.rollno = rollno;
    }
    public static void main(String args []){
        Constr constr=new Constr(12,"Ram",21);
        System.out.println("detail of student " + constr.age + "  "+ constr.name + "  " + constr.rollno );
    }
}
