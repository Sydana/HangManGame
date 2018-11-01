import java.util.Scanner;

public class HangManGame {
    public static void main(String[] args) {
        //, "knowledge", "cook", "wry", "best"
        Scanner keyboard;
        int hangMan = 0;
        int score = 0;
        String guessedLetter;
        boolean value = true;
        String playAgain = "";
        String[] chosenWord = {"pour"};
        keyboard = new Scanner(System.in);

        System.out.println("This is the Hang Man Game. These are the rules.");
        System.out.println("There is going to be a word that you have to guess by guessing the letters that make up said word.");
        System.out.println("You get fifteen tries to do so. If you win, you gain a point.\nYou could see your score at the end of the game, where you could choose to restart the game.");
        System.out.println("Let's get started.");

        while (value) {
            for (int i = 0; i < chosenWord.length; i++){
                int generatedNumber = (int) (Math.random() * 1);
                System.out.println("Guess a letter.");

                guessedLetter = keyboard.nextLine();

                System.out.println(chosenWord[generatedNumber]);
                    if (chosenWord[generatedNumber].equals("pour")) {
                        if (guessedLetter.equals("p") || guessedLetter.equals("o") || guessedLetter.equals("u") || guessedLetter.equals("r")) {
                            guessedLetter = keyboard.nextLine();
                        }
                        else{
                        System.out.println(printMan(hangMan, false, guessedLetter,"pour"));
                        hangMan++;
                        }
                        if (guessedLetter.equals("p") && guessedLetter.equals("o") && guessedLetter.equals("u") && guessedLetter.equals("r")) {
                            System.out.println(printMan(hangMan, true, guessedLetter,"pour"));
                            value = false;
                        }
                        if (hangMan>11){
                         value = false;
                         System.out.println(printMan(hangMan, false, guessedLetter,"pour"));
                        }

            }

        }
    }
}

    public static String printMan(int tries, boolean win, String guessedLetter, String chosenWord) {
        String response = "";
        String message;
        if (win) {
            message = "That is unbelievable. You WIN!";
        } else {
            message = "Nope, that's wrong.";
        }
        switch (tries) {

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
                        "||        \n" +
                        "||          \n" +
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
                        "||          \n" +
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
                        "||        +  \n" +
                        "||        \n" +
                        "||      \n" +
                        "||\n" +
                        "\n" +
                        message +
                        " Guess again.";
                break;
            case 6:
                response = "==========|\n" +
                        "||        |\n" +
                        "||        0\n" +
                        "||      --+  \n" +
                        "||        \n" +
                        "||       \n" +
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
                        "||        \n" +
                        "||       \n" +
                        "||\n" +
                        "\n" +
                        message +
                        " Guess again.";
                break;
            case 8:
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
            case 9:
                response = "==========|\n" +
                        "||        |\n" +
                        "||        0\n" +
                        "||      --+--\n" +
                        "||        |\n" +
                        "||      _/\n" +
                        "||      \n" +
                        "\n" +
                        message +
                        " Guess again.";
                break;
            case 10:
                response = "==========|\n" +
                        "||        |\n" +
                        "||        0\n" +
                        "||      --+--\n" +
                        "||        |\n" +
                        "||      _/ \\_\n" +
                        "||\n" +
                        "\n" +
                        message +
                        " Game over.";
                break;
        }
    return "";
    }
}