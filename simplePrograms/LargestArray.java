public class LargestArray{
    public static void main(String args[]){
        int[] arr = new int[5];
        int[] newArr = new int[]{1,2,3,4,5,6,7,8,11,24,5,4,5,3,4,5};
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