import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Guess{
    public static int randomGuess(int range){
        Random rd = new Random();
        int num   = rd.nextInt(range);
        return num;
    }

    public static void main(String args[]){
        int noOfAttempts = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Mysterious Number Guesser!");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");
        int ans = randomGuess(100);
        int guessed;
        while(true){
            System.out.println("Enter Your guess : ");
            if(sc.hasNextInt()){
                   guessed = sc.nextInt();
                   int res = Math.abs(guessed - ans);
                   System.out.println(ans);
                    if(res == 0){
                    System.out.println("Congratulations! You guessed the mysterious number!");
                    break;
                    }
                    else if( res <= 10){
                     System.out.println("You are too close");
                    }
                    else{
                    System.out.println("You're far away!");
                    }
            }
            else{
                System.out.println("Error : Please Enter a valid number");
                sc.nextLine();
            }
            noOfAttempts-=1;
        }
    }
}