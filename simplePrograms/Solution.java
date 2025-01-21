import java.io.*;
import java.util.*;
import java.lang.Math;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static List<List<Integer>> DeepCopy(List<List<Integer>> Original){
        List<List<Integer>> newarr = new ArrayList<>();
        for(List<Integer> r:Original){
            List<Integer> newr = new ArrayList<>(r);
            newarr.add(newr);
        }
        return newarr;
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
    
    return arr;
    }

    public static List<List<Integer>> findMatrix(int N, List<List<Integer>> A) {
        List<List<Integer>> dup = DeepCopy(A);
        rotateMatrixBy90(A);
        insertNewMatrixWithOnes(dup,A);
        rotateMatrixBy90(A);
        insertNewMatrixWithOnes(dup,A);
        rotateMatrixBy90(A);
        insertNewMatrixWithOnes(dup,A);
        return dup;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int N = Integer.parseInt(scan.nextLine().trim());
        
        List<List<Integer>> A = new ArrayList<>(N);
        for(int i=0; i<N; i++) {
            A.add(
                Arrays.asList(scan.nextLine().trim().split(" "))
                .stream().map(s -> Integer.parseInt(s)).collect(toList())
            );
        }
    
        List<List<Integer>> result = findMatrix(N, A);
    
        for(int i=0; i<result.size(); i++) {
            for (int j=0; j<result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j));
                if (j < result.get(i).size() - 1) System.out.print(" ");    
            }
            System.out.println();
        }
    }
}