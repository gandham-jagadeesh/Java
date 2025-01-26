
import java.util.*;


public class shallowCopy{
    public static void main(String args[]){
    //     List<Integer> ar1 = new ArrayList<>();
    //     ar1.add(10);
    //     ar1.add(20);
    //     ar1.add(30);
    //    System.out.println(ar1);
    //     List<Integer> newar1 = new ArrayList<>(ar1);
    //    System.out.println(newar1);
    //    newar1.set(0,1);
    //    System.out.println("dup arr"+newar1);
    //    System.out.println("oldarr"+ar1);

       List<List<Integer>> sc1  = new ArrayList<>();
       sc1.add(new ArrayList<>());
       sc1.get(0).add(1);
       sc1.get(0).add(2);
       sc1.get(0).add(3);
       System.out.println(sc1);

       List<List<Integer>> sc2 = new ArrayList<>(sc1);
       System.out.println("sc2"+sc2);
       sc2.get(0).set(0,20);
       System.out.println("sc2"+sc2);
       System.out.println("sc1"+sc1);
    }
}