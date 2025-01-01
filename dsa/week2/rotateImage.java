class rotateImage {
    public void rotate(int[][] matrix) {
        int left=0;
        int right = matrix[0].length-1;
        while( left <= right ){
            int top = left;
            int bottom = right;
            int topleft;
            int iter = right-left; //how many iterations  
            for( int i=0; i<iter; i++ ){ //moving anti clock wise
                topleft = matrix[top][left+i]; //save top left 
                matrix[top][left+i] = matrix[bottom-i][left]; 
                matrix[bottom-i][left] = matrix[bottom][right-i]; 
                matrix[bottom][right-i] = matrix[top+i][right];
                matrix[top+i][right] = topleft;
            }
            left+=1;
            right-=1;
        }
      
    }
}

/*
 neetcode : top,bottom,left,right -> manipulate pointers and reverse each layer : revist it again after some time : hard to wrap around
 Transpose and reverse => to make it to 90 degrees
 striver approach : transpose and reverse each row
Time complexity : o(n^2)
space complexity : o(1)
*/