
import java.util.*;


public class hashmaps{
    public static void main(String args[]){
        int[] arr = new int[]{1,2,3,4,5,6,7,10,12,14,2,2,2,1,1,1,1,1};
        Map<Integer,Integer> map = new HashMap<>();
        for(int each:arr){
            if(!map.containsKey(each)){
                map.put(each,1);
            }
            else{
                map.put(each,map.get(each)+1);
            }
        }
        System.out.println(map);
        System.out.println(map.get(1));
        //iteration : 
        for(Map.Entry<Integer,Integer> eachItem : map.entrySet()){
            System.out.println(" key : " + eachItem.getKey() + "  value -> " + eachItem.getValue());
        }
    }
}