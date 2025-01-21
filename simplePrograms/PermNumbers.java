//greedy approach
//find each index and check whether the next number is leftside or rightside based on the direction

//Add map to reduce tc to 0(n) increases sc to 0(n)
public class PermNumbers{
    public static int findIndex(int[] arr,int val){
        int size = arr.length;
        for(int index = 0; index < size; index++){
            if(arr[index] == val){
                return index;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr={1,2,3};
        int n=3;
        int res = findMinTurns(arr, n);
        System.out.println(res);
    }

    public static int findMinTurns(int[] arr,int n){
        int turn=0;
        String dir = "lr";
        int size = arr.length;
        if(size == 0 || size == 1){ return 0;}
        int currpos = findIndex(arr, 1);
        for(int curr=2;curr<=n;curr++){
            int nextPos =findIndex(arr, curr);
            if(dir.equals("lr")){
                if(currpos < nextPos){
                    currpos=nextPos;
                }
                else{
                    currpos=nextPos;
                    turn+=1;
                    dir="rl";
                }

            }
            else if(dir.equals("rl")){
                if(currpos > nextPos){
                    currpos=nextPos;
                }
                else{
                    currpos=nextPos;
                    turn+=1;
                    dir="lr";
                }
            }
        }
        return turn;
    }
}