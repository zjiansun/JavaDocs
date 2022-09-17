package learning.firststeps;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        int randomNum = (int)Math.round(Math.random()*100 + 1);
        Scanner sc = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("Welcome to the game! Guess the number between 1 - 100");
        System.out.println();
        while(true){
            System.out.println("Enter a guess");
            int newGuess = sc.nextInt();

            if(newGuess > randomNum){
                System.out.println("Too high!");
            }else if(newGuess < randomNum){
                System.out.println("Too low!");
            }else{
                System.out.println("YOU WON! The answer was "+randomNum);
                break;
            }
        }
    }
    }
