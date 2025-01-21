

// rotate matrix by 90 180 270 and find 

import java.util.ArrayList;
import java.util.List;

public class rotateMatrix{

    public static List<List<Integer>> createNewArray(int rsize,int csize){
        List<List<Integer>> result = new ArrayList<>();
        for(int r=0; r < rsize; r++){
            List<Integer> r1 = new ArrayList<>();
            result.add(r1);
            for(int c=0; c < csize; c++){
                List<Integer> rws = result.get(r);
                rws.add(0);
            }
        }
        return result;
    }
    public static void insertNewMatrixWithOnes(List<List<Integer>> arr,List<List<Integer>> matrix){
        int rsize = arr.size();
        int csize = arr.get(0).size();
        for(int r=0; r < rsize; r++){
            for(int c=0; c < csize; c++){
                if(matrix.get(r).get(c) == 1){
                    arr.get(r).set(c,1);
                }
            }
        }
    }

    public static List<List<Integer>> rotateMatrixBy90(List<List<Integer>> arr){
        int rsize = arr.size();
        int csize = arr.get(0).size();


        for(int r=0; r < rsize; r++){
            for(int c=r+1; c < csize; c++){
                int rele = arr.get(r).get(c);
                int cele = arr.get(c).get(r);
                arr.get(r).set(c,cele);
                arr.get(c).set(r,rele);
            }
        }


        //reversing the row -> do two pointers to reverse the row
        for(int r=0; r < rsize; r++){
            List<Integer> rw = arr.get(r);
            int start  = 0;
            int end  = rw.size()-1;
            while(start <= end){
                int val = rw.get(start);
                rw.set(start,rw.get(end));
                rw.set(end,val);
                start+=1;
                end-=1;
            }
        }
        System.out.println(arr);
    return arr;
    }

    public static void main(String args[]){
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>());
        arr.add(new ArrayList<>());
        arr.add(new ArrayList<>());

        arr.get(0).add(0);
        arr.get(0).add(0);
        arr.get(0).add(0);

        arr.get(1).add(0);
        arr.get(1).add(0);
        arr.get(1).add(0);
        
        arr.get(2).add(0);
        arr.get(2).add(0);
        arr.get(2).add(0);

    //    List<List<Integer>>  r1 = createNewArray(2,2);
        List<List<Integer>>  m1 = new ArrayList<>(rotateMatrixBy90(arr));
    //    insertNewMatrixWithOnes(r1, m1);
    //    List<List<Integer>>  m2 = new ArrayList<>(rotateMatrixBy90(m1));
    //    insertNewMatrixWithOnes(r1, m2);
    //    List<List<Integer>>  m3 = new ArrayList<>(rotateMatrixBy90(m2));
    //    insertNewMatrixWithOnes(r1, m3);
    //    System.out.println(r1);
    }
}

/*
 * 
 * [1,2,3]
 * [2,5,6]
 * [3,6,9]
 */