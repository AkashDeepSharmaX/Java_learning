package Collection.List;
import java.util.*;
public class FirstList {
    public static void main (String []args){
    List<String> list=  new ArrayList<>();
    list.add("apple");
    list.add("banana");
    list.add("pear");
    list.add("chiku");
    for(int i= 0; i<=list.size(); i++){
        String fruits = list.get(i);
        System.out.println(fruits);

    }


    }
    
}
