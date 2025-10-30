import java.util.Scanner;
public class ScoreList {
        public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the name of the player: ");
            String playerName = sc.nextLine();
            System.out.print("Enter the Score obtained by the Player: ");
            int playerScore = sc.nextInt();
             int highScorePosition = calculateHighScorePosition(playerScore);
            displayHighScorePosition(playerName, highScorePosition);
        }
    }
    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.print(playerName+" managed to get into position "+highScorePosition+" on the high score list.");
    }
    public static int calculateHighScorePosition(int playerScore){
        int score ;
        if(playerScore>=1000){
            score = 1;
        }
        else if(playerScore>=500){
            score = 2;
        }
        else if(playerScore>=100){
            score = 3;
        }
        else{
            score = 4;
        }
        return score;
    }
}
