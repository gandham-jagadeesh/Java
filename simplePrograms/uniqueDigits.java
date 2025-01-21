import java.io.*;
import java.util.*;
import java.lang.Math;
public class uniqueDigits {
public static int MostSpecialNumber(int n,int[] arr){
 
        if(arr.length == 1){
            return arr[0];
        }
        
        Map<Integer,Integer> map = new HashMap<>();
        int maxNumber = 0;
        for(int i=0; i < arr.length; i++){
            map.put(arr[i],largestUniqueDigits(arr[i]));
            maxNumber = Math.max(maxNumber,arr[i]);
        }
      //if All are Equal then send the largest Number
       int[] arry = new int[map.size()];
       int count=0;
       
       for(Integer val:map.values()){
           arry[count++]=val;
       }

       if(checkAllEqualUniqueLength(arry)){
           return maxNumber;
       }
       else{
           int maxDigit = 0;
           int maxDigitNumber = 0;
           for(int key:arr){
            System.out.println(map);
               int dig = map.get(key);
               if(dig > maxDigit){
                   maxDigit = dig;
                   maxDigitNumber = key;
               }
            }
            return maxDigitNumber;
           }
       } 
    

    public static boolean checkAllEqualUniqueLength(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static int largestUniqueDigits(int num){
        HashSet<Integer> set = new HashSet<>();
        String StringNum = Integer.toString(num);
        char[] charArr   = StringNum.toCharArray();
        for(char digit:charArr){
            int dig = digit-'0';
            set.add(dig);
        }
        return set.size();
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        n=scan.nextInt();
        int[] arr = new int[n];
        for(int j=0;j<n;j++){
            arr[j]=scan.nextInt();
        }
        int result;
        result = MostSpecialNumber(n,arr);
        System.out.print(result);
        return ;
    }
}