package Methods;

public class Solution {

    public static void main(String[] args) {

        String name = "Tom";

        displayHighScorePosition(name,1500);
        displayHighScorePosition(name,900);
        displayHighScorePosition(name,400);
        displayHighScorePosition(name,50);


    }

    public static void displayHighScorePosition(String nameIn,int positionIn){
        System.out.println(nameIn + " managed to get into position "
                + calculateHighScorePosition(positionIn) + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScoreIn){
        if(playerScoreIn >=1000)
            return 1;
        else if((playerScoreIn < 1000) && (playerScoreIn >= 500))
            return 2;
        else if((playerScoreIn < 500) && (playerScoreIn >=  100))
            return 3;
        else
            return 4;
    }
}
