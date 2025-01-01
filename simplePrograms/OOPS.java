import java.util.*;

class OOPS{
 public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
      int total=0;
    while(true){
        int num = sc.nextInt();
        if( num == 0 || num < 0){
            break;
        }
        total+=num;
    }
    System.out.println(total);
 }}