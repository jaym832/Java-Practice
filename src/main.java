public class main {
    public static void main(String[] args) {


//       double num1= 20.00;
//       double num2=80.00;
//
//       double sumOfNumsAndMultiply=(num1+num2)*100;
//
//        System.out.println("My Values total "+sumOfNumsAndMultiply);
//
//       double remainderOfNums=sumOfNumsAndMultiply%40.00;
//
//        System.out.println("remainder "+remainderOfNums);
//
//        boolean isNoRemainder=(remainderOfNums==0)?true:false;
//
//        System.out.println(isNoRemainder);
//
//        if(!isNoRemainder){
//            System.out.println("Got some remainder");
//        }

        //testing

//////////////////////////////////////////////////////////////////////////////////

       //highscore challenge
       // have 2 methods that 1: displays the name and the position from score
       // method 2 is going to calculate the position based on score
        int score = calculateHighScorePosition(1000);
        displayHighScorePosition("javier", score);

         score = calculateHighScorePosition(900);
        displayHighScorePosition("bob", score);

        score = calculateHighScorePosition(400);
        displayHighScorePosition("sally", score);

        score = calculateHighScorePosition(50);
        displayHighScorePosition("mary", score);





    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into " + position + " place");
    }

    public static int calculateHighScorePosition(int score) {
        int position;
        if (score >=1000) {
            position = 1;
        } else if (score >=500 && score < 1000) {
            position = 2;
        } else if (score >= 100 && score < 500) {
            position = 3;
        } else position = 4;

        return position;
    }


}
