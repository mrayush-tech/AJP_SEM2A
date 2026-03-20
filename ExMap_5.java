import java.util.Arrays;
import java.util.List;

public class ExMap_5 {
    public static void main(String[] args) {
         List<String> names=Arrays.asList("A","B","C");
         System.out.println(names);
         List<String>result=names.stream()
          .map(name->"Item_"+name)
                     .toList();
                     System.out.println(result);
    }
}
