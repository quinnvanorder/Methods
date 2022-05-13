public class Main {
    public static void main(String[] args) {
        /*
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);
        */
        String name = "Rainbow Dash";
        int score = 1500;
        int position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

        name = "Applejack";
        score = 900;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

        name = "Twilight";
        score = 400;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

        name = "Fluttershy";
        score = 50;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);



    }

    /*
    first method... so it's like a function in powershell... neat I know this.
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    //Challenge time!

    Create a method called displayHighScorePosition Void method (aka procedure)
    It should receive a players name as a parameter, and a 2nd parameter as a position in the high score table
    you should display the players name along with a message like "managed to get into position" and the
    position they got and a further message "on the high score table"

    Create a 2nd method called calculateHighScorePosition (aka function as its returning stuff)
    it should be sent one argument only, the player score
    it should return an int
    the return data should be
    1 if the score is > 1000
    2 if the score is >500 and < 1000
    3 if the score is > 100 and < 500
    4 in all other cases
    call both methods and display the results of the following
    a score of 1500, 900, 400, and 50
     */

    public static void displayHighScorePosition(String name,int position){
        if (name == "Rainbow Dash"){
            System.out.println(name + " managed to get into position " + position + " on the high score table, because she is the best at sports!");
        }
        else {
            System.out.println(name + " managed to get into position " + position + " on the high score table!");
        }
    }

    public static int calculateHighScorePosition(int score){
/*
        if (score >= 1000)
            return 1;
        if (score >= 500)
            return 2;
        if (score >= 100)
            return 3;
        return 4;

        alternate path to avoid a ton of returns.
 */
        int position = 4;

        if(score >= 1000)
            position = 1;
        if(score >= 500)
            position = 2;
        if(score >= 100)
            position = 3;

        return position;
    }
}