import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class stream_2 {
    public static void main(String[] args) {
        List<Integer> data=Arrays.asList(24,25,47,67);
        System.out.println(data);
        ArrayList<Integer>list=new ArrayList<Integer>();
        list.add(23);
        list.add(45);
        list.addAll(List.of(23,56,78,23,45,67,85,40));
    list.addAll(data);
System.out.println(list);
list.stream().filter((n)->n>60).forEach((n)->System.out.print(n+" "));
List<Integer>g60=list.stream().filter((n)->n>60 && n<90).toList();
System.out.println();
System.out.println(g60);
}
}
