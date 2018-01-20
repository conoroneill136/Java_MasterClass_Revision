package MethodOverload;

public class Main {

//    public static void main(String[] args) {
////
////        int newScore = calculateScore("Tim",500);
////        System.out.println("New Score is " + newScore);
////        calculateScore(75);
////        calculateScore();
////    }
////
////    public static int calculateScore(String playerName,int score){
////        System.out.println("Player " + playerName + " scored " + score + " points");
////        return score * 1000;
////    }
////
////    public static int calculateScore(int score){
////        System.out.println("Unnamed Player "  + " scored " + score + " points");
////        return score * 1000;
////    }
////
////    public static int calculateScore(){
////        System.out.println("No Player name, no player score");
////        return 0;
////    }

    public static void main(String[] args) {

        System.out.println(calcFeetAndInchesToCentimeters(-10));

    }

    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if(feet >= 0 && ((inches >= 0 || inches >12 ))){
         double centimeters = (feet * 12 * 2.54  ) + ( inches * 2.54);
         System.out.println(feet +" feet, " + inches + "inches = " + centimeters + "centimeters");
         return centimeters;
        }
        System.out.println("invalid feet or inches parameters");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0 ){
            double inchesToFeet = (int) inches / 12;
            double remainderInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to "
                    + inchesToFeet + "feet and " + remainderInches + " inches");
            return calcFeetAndInchesToCentimeters(inchesToFeet,remainderInches);
        }
        System.out.println("invalid inches parameters");
        return -1;
    }

}
