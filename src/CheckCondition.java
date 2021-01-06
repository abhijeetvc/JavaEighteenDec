import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckCondition {

    public static void main(String[] args) {

        List<String> list= Arrays.asList("India","US","Japan","France","China","Australia");
        System.out.println("Original list: "+list);
        List<String> newList=list.stream().filter(str->!"China".equals(str)).collect(Collectors.toList());
        System.out.println("New List: "+newList);

        List<Integer> list1=Arrays.asList(10,5,20,25,30,35);
    }
}
