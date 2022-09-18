package challenges.ccc.j2022;
import java.util.Scanner;

//Fergusonball
public class J2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int playersNum = sc.nextInt();
        int goldNum = 0; //init gold player count

        for(int i=0;i<playersNum;i++){ //for every player, get their pts and fouls
            int pts = sc.nextInt();
            int fouls = sc.nextInt();
            if(pts*5-fouls*3>40){ //check if they're a gold player
                goldNum+=1;
            }
        }
        if(goldNum==playersNum){ //gold team?
            System.out.println(goldNum+"+");
        }else{
            System.out.println(goldNum);
        }

        //THIS ALGORITHM CAN BE IMPROVED I THINK.
    }
}
