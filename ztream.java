import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class ztream{
public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(23);
list.add(45);
list.addAll(List.of(23,56,78,23,45,67));
System.out.println(list);
//Stream liStream=list.stream();
list.stream().filter(n->n>60).forEach(element)->System.out.println(element);
//  list.stream.forEach(element)->System.out.print(element+" ");
// list.stream().forEach(element)->System.out.print(element+" ");
// ?list.stream().forEach(System.out.println);
System.out.println();
System.out.println("count"+list.stream().filter(item)->item>60).count();
// liStream.forEach(System.out::println);

}}