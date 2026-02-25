import java.util.Arrays;
import java.util.List;
// import java.util.function.;;
//import java.util.
 record student(int sid, String name, String course) {
}
public class c {
    public static void main(String[] args) {
    int data []=new int []{23,45,67,89,23};
    List<Integer>listData= Arrays.stream(data).boxed().toList(); 
//System.out.println(listdata);
//    listData.forEach(item)->System.out.println(item);
      listData.forEach(System.out::println);

    }
}

