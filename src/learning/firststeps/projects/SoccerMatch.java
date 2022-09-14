package learning.firststeps.projects;
import java.util.Scanner;

public class SoccerMatch {
    static int ballPos = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myGoal = -3;
        int opGoal = 3;

        switch (ballPos){
            case -3:
                System.out.println("You lost!!! Play again.");
            case 3:
                System.out.println("A GOAL!!!! YOU WON!!!");
            default:
                System.out.println("Choose your next move! Do you want to:");
                System.out.println("(1) Attack");
                System.out.println("(2) Dribble");
                System.out.println("(3) Defend");
                int myMove = sc.nextInt();
                int opMove = getOpMove();

                if(myMove == 1 && opMove == 1){//both attack
                    System.out.println("You both attacked the ball. In vain");
                    ballPos = ballPos;
                    System.out.println(ballStatus(ballPos));
                } else if(myMove == 1 && opMove == 2){
                    //TODO: ATTACK vs DRIBBLE
                    System.out.println("The opponent outplayed you with his dribbles. You lost the ball.");
                    ballPos = ballPos-1;
                    System.out.println(ballStatus(ballPos));
                } else if(myMove == 1 && opMove == 3){
                    //TODO: ATTACK vs DEFEND
                    System.out.println("The opponent defended the ball. It stayed at the same place");
                    ballPos = ballPos;
                    System.out.println(ballStatus(ballPos));
                }
                //TODO: DRIBBLE vs DRIBBLE
                //TODO: DRIBBLE vs DEFEND
                //TODO: DEFEND vs ATTACK
                //TODO: DEFEND vs DRIBBLE
                //TODO: DEFEND vs DEFEND


        }

    }

    static void resetBall(){
        ballPos = 0;
    }
    static int getOpMove(){
        return (int)Math.floor(Math.random()*(3-1+1)+1);
    }
    static String ballStatus(int pos){
        switch (pos){
            case -2:
                return "Watch out, the ball is in your goal zone!";
            case -1:
                return "The ball's in your midfield.";
            case 0:
                return "The ball is in the middle. Up for grabs!";
            case 1:
                return "The ball is in your opponent's midfield, attack forward!!";
            case 2:
                return "The ball is in your opponent's goal zone~~ smells like scoring time!";
            default:
                return "Bruh, the ball's out of the court";
        }
    }
}
