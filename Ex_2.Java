import java.util.Arrays;
import java.util.List;

public class Ex_2 {
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("Apple", "Banana", "Avocado", "Mango", "Apricot", "Orange");
        ArrayList<String>data=new ArrayList<String>();
        list.addAll(list);
        
        list.stream()
            .filter(s -> s.startsWith("A"))
            .forEach(s -> System.out::println);
    }
}