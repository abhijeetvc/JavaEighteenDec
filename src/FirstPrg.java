import java.util.Arrays;
import java.util.List;

public class FirstPrg {

    public static void main(String[] args) {
//        int x=Integer.MIN_VALUE;
//        System.out.println("Min value of x: "+x);
        List<Integer> list= Arrays.asList(10,5,20,25,30,35);
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
        int i=0;
        for(;i<list.size();){
            System.out.println(list.get(i));
            i++;
        }
       // list.forEach(a-> System.out.println(a));

        list.forEach(System.out::println);
    }
}
