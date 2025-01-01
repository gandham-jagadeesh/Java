// Sorting approach

class Solution {
    public int removeElement(int[] nums, int val) {
        int replace = 101;
        int size = nums.length;
        int result=0;
        boolean isValidExists = false;
        for(int i=0; i < size; i++ ){
            if(nums[i] == val){
                isValidExists = true;
                nums[i]=replace;
            }
        }
        Arrays.sort(nums);
        for(int i=0 ; i < size ; i++ ){
            if(nums[i] == 101){
                result = i;
                break;
            }
        }
    System.out.println(result);
    if(!isValidExists)
        return nums.length;
     return result;
    }
}

// Two pointers

class Solution {
    public int removeElement(int[] nums, int val) {
    int start = 0;
    int size = nums.length;
    if( size == 0 ){
        return 0;
    }
    int end = nums.length-1;
    int temp;
    int res=0;
    int count=0;

    while( start <= end ){
        if( nums[start] == val ){
            if( nums[end] == val ){
                end-=1;
            }
            else{
                temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;
                start+=1;
                end-=1;
                
            }
        }
        else{
            start+=1;
            }
    }
    boolean isValid = true;

    for(int i=0;i<size;i++){
        if(nums[i] == val){
            return i;
        }
    }
 
    return size;
}
}