import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex_3 {
    public static void main(String[] args) {
        List<Integer>list=Arrays.asList(10,60,45,90,30,24,50,76);
        ArrayList<Integer> data=new ArrayList<Integer>();
        list.addAll(list);
        list.stream()
         .filter(n -> n > 50 && n < 60)
        .forEach(System.out::println);
    }
}
