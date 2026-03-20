,import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map {
    public static void main(String[] args) {
        
        List<Integer> numbers=Arrays.asList(23,45,36,67,89,95);
        // ArrayList<Integer>list=new ArrayList<Integer>();  // By using  this we have do (add/remove)
        // list.addAll(numbers);
        System.out.println(numbers);
        List<Integer> result=numbers.stream().filter(n->).map(null);
    System.out.println(result);    }
}