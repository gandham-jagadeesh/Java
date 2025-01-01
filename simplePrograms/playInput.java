import java.util.*;

public class playInput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int val = sc.nextInt();
        }
        else{
            System.out.println("not a number");
            sc.nextLine(); //take that invalid token
        }
    }
}