import java.util.Arrays;
import java.util.List;

public class StreamSorted_1 {
    public static void main(String[] args) {
         List<Integer> list =Arrays.asList(12,5,33,9,21,1);
        System.out.println(list);
       // List<Integer> sortedList=list.stream().sorted((a,b)->a-b).toList();
        List<Integer> sortedList1=list.stream().sorted((a,b)->b-a).limit(3).toList();
        //List<Integer> sortedList2=list.stream().sorted((a,b)->a-b).toList();
       // System.out.println(sortedList);
        System.out.println(sortedList1);
    }
}
