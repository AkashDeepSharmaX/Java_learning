public class Stringsop{
    public static void main (String[]arg){
        // declarin string 
        String str1= "hello world !";// The string literal "Hello, World!" is stored in the String Pool, a special area in Java's memory that is used to optimize memory usage for strings.
        String str2 = new String("hello world !");//It bypasses the String Pool and always creates a new instance in memory
        System.out.println(str1==str2);//// false (different objects)
        // checking of length using length()
        System.out.println(""+str2.length());
        System.out.println(""+str1.length());//Returns the length of the string
        //Returns the index of a character or substringReturns the character at a specified index
        System.out.println("geting character "+str2.charAt(12));
        //Extracts a substring
        System.out.println(" substring " + str1.substring(0,6));
        // using toUpperCase()
        System.out.println(" converting to upercase"+str1.toUpperCase() );//Converts all characters to uppercase
        //using toLowerCase()
        System.out.println(" converting to upercase"+str2.toLowerCase() );//Converts all characters to lowercase
        // using indexOf(char)
        System.out.println("getting index value "+str1.indexOf("r"));//Returns the index of a character or substring
        //using equals(anotherString)
        System.out.println("equal case"+str1.equals(str2));//equals(anotherString)

    }
}