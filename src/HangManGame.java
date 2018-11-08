import java.util.Scanner;

public class HangManGame {
    public static void main(String[] args) {
        //, "knowledge", "cook", "wry", "best"
        // String[] chosenWord = {"pour"};
        // for (int i = 0; i < chosenWord.length; i++){
        Scanner keyboard;
        int hangMan = 0;
        int score = 0;
        String guessedLetter;
        boolean value = true;
        String playAgain = "";
        String [] chosenWord = {"pour","knowledge", "cook", "wry", "best"};
        String currentWord;

        keyboard = new Scanner(System.in);

        System.out.println("This is the Hang Man Game. These are the rules.");
        System.out.println("There is going to be a word that you have to guess by guessing the letters that make up said word.");
        System.out.println("Now, once you think you have the word, type out the word to win.\nHere's the kicker, I'm not telling you which order the letters are in.");
        System.out.println("You get 8 tries to do so. If you win, you gain a point.\nYou could see your score at the end of the game, where you could choose to restart the game.");
        System.out.println("Let's get started.");
        int generatedNumber = (int) (Math.random() * chosenWord.length);

        while (value) {

                
                System.out.println("Guess a letter.");
                currentWord = chosenWord[generatedNumber];
                System.out.println(currentWord);
                guessedLetter = keyboard.nextLine().toLowerCase();



                       if(guessedLetterRight(currentWord,guessedLetter)){
                           System.out.println("correct.");

                           //System.out.println(printMan(hangMan,false));
                       }
                       else{

                           System.out.println(printMan(hangMan,false));
                           hangMan++;
                       }
                       if (hangMan>6){
                           value = false;
                           System.out.println(printMan(hangMan,false));
                       }
                       if (guessedLetter.equals("pour")){
                           System.out.println(printMan(hangMan,true));
                       }



        }
    }


    public static String printMan(int tries, boolean win) {
        String response = "";
        String message;
        if (win) {
            message = "That is unbelievable. You WIN!";
        } else {
            message = "Nope, that's wrong.";
        }
        switch (tries) {

            default:
            case 0:
                Scanner keyboard;
                keyboard = new Scanner(System.in);
                String reset;
                response = "==========|\n" +
                        "||        \n" +
                        "||        \n" +
                        "||          \n" +
                        "||        \n" +
                        "||      \n" +
                        "||\n"
                        + message;
                break;
            case 1:
                response =
                        "==========|\n" +
                                "||        |\n" +
                                "||        0\n" +
                                "||          \n" +
                                "||        \n" +
                                "||      \n" +
                                "||\n" +
                                "\n" +
                                message +
                                " Guess again.";
                break;
            case 2:
                response = "==========|\n" +
                        "||        |\n" +
                        "||        0\n" +
                        "||        +\n" +
                        "||        \n" +
                        "||      \n" +
                        "||\n" +
                        "\n" +
                        message +
                        " Guess again.";
                break;
            case 3:
                response = "==========|\n" +
                        "||        |\n" +
                        "||        0\n" +
                        "||      --+\n" +
                        "||        \n" +
                        "||      \n" +
                        "||\n" +
                        "\n" +
                        message +
                        " Guess again.";
                break;
            case 4:
                response = "==========|\n" +
                        "||        |\n" +
                        "||        0\n" +
                        "||      --+--\n" +
                        "||        \n" +
                        "||      \n" +
                        "||\n" +
                        "\n" +
                        message +
                        " Guess again.";
                break;
            case 5:
                response = "==========|\n" +
                        "||        |\n" +
                        "||        0\n" +
                        "||      --+--\n" +
                        "||        |\n" +
                        "||       \n" +
                        "||\n" +
                        "\n" +
                        message +
                        " Guess again.";
                break;
            case 6:
                response = "==========|\n" +
                        "||        |\n" +
                        "||        0\n" +
                        "||      --+--\n" +
                        "||        |\n" +
                        "||      _/ \n" +
                        "||\n" +
                        "\n" +
                        message +
                        " Guess again.";
                break;
            case 7:
                response = "==========|\n" +
                        "||        |\n" +
                        "||        0\n" +
                        "||      --+--\n" +
                        "||        |\n" +
                        "||      _/ \\_\n" +
                        "||\n" +
                        "\n" +
                        message + " Game over."
                        ;
                break;
        }
    return response;
    }

    public static boolean guessedLetterRight(String secretWord, String guessLetter){
        //System.out.println("The secret word is: "+ secretWord);
        //System.out.println("The guess letter is: "+ guessLetter);
        //System.out.println("The secret word contains the letter: "+ secretWord.contains(guessLetter.toLowerCase()));
      return secretWord.contains(guessLetter.toLowerCase());

    }
}