import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex_1 {
    public static void main(String[] args) {
        

    List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 11, 17, 16);
    ArrayList<Integer>data=new ArrayList<Integer>();
    list.addAll(list);
        list.stream()
         .filter(n -> n % 2 == 0)
         .forEach(n -> System.out.println(n + " "));
    }
}
    
