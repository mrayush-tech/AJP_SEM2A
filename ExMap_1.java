
import java.util.*;
import java.util.stream.*;
public class ExMap_1 {

    public static void main(String[] args) {

         List<String> names=Arrays.asList("sachin","rahul","amit");
         System.out.println(names);
         List<String>result=names.stream()
                     .map(name->name.toUpperCase())
                     .toList();
                     System.out.println(result);
    
    }
}