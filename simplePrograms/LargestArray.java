public class LargestArray{
    public static void main(String args[]){
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        int max = -1;
        for(int num:arr){
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);
    }
}