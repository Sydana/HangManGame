import java.util.Scanner;

public class HangManGame {
    public static void main(String[] args) {
        //, "knowledge", "cook", "wry", "best"
        // String[] chosenWord = {"pour"};
        // for (int i = 0; i < chosenWord.length; i++){
        Scanner keyboard;
        int hangMan;
        int score = 0;
        String guessedLetter;
        boolean value = true;
        String playAgain = "";
        String [] chosenWord = {"pour","feel", "cook", "wry", "best", "stove", "peep","nourish", "enlarge", "cough", "bed", "see", "degree", "island", "lethal", "utter", "tangy", "whisper", "crazy", "tedious",
                                "brush", "song", "jeans", "base", "paper", "fax", "look", "grace", "surpass", "skate", "sydana"};
        String currentWord;

        keyboard = new Scanner(System.in);

        while (value) {
        hangMan = 0;

        System.out.println("This is the Hang Man Game. These are the rules.");
        System.out.println("There is going to be a word that you have to guess by guessing the letters that make up said word.");
        System.out.println("Now, once you think you have the word, type out the word to win.\nHere's the kicker, I'm not telling you which order the letters are in.");
        System.out.println("You get 8 tries to do so. If you win, you gain a point.\nYou could see your score at the end of the game, where you could choose to restart the game.");
        System.out.println("Let's get started.");
        int generatedNumber = (int) (Math.random() * chosenWord.length);





                currentWord = chosenWord[generatedNumber];
                //System.out.println(currentWord);


                while (value) {
                    System.out.println("Guess a letter.");
                    guessedLetter = keyboard.nextLine().toLowerCase();

                    if (guessedLetterRight(currentWord, guessedLetter)) {
                        System.out.println("correct.");

                        //System.out.println(printMan(hangMan,false));
                    } else {

                        System.out.println(printMan(hangMan, false));
                        hangMan++;
                    }
                    if (hangMan >7) {
                        value = false;
                        System.out.println(printMan(hangMan, false));
                        System.out.println("The answer was \""+chosenWord[generatedNumber]+"\"");
                    }


                    if (currentWord.equals("pour") && guessedLetter.equals("pour")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("wry") && guessedLetter.equals("wry")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("best") && guessedLetter.equals("best")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("cook") && guessedLetter.equals("cook")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("feel") && guessedLetter.equals("feel")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("stove") && guessedLetter.equals("stove")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("peep") && guessedLetter.equals("peep")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("peep") && guessedLetter.equals("peep")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("nourish") && guessedLetter.equals("nourish")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("enlarge") && guessedLetter.equals("enlarge")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("cough") && guessedLetter.equals("cough")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("bed") && guessedLetter.equals("bed")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("see") && guessedLetter.equals("see")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("degree") && guessedLetter.equals("degree")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("island") && guessedLetter.equals("island")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("lethal") && guessedLetter.equals("lethal")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("utter") && guessedLetter.equals("utter")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("tangy") && guessedLetter.equals("tangy")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("whisper") && guessedLetter.equals("whisper")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("crazy") && guessedLetter.equals("crazy")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("tedious") && guessedLetter.equals("tedious")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("brush") && guessedLetter.equals("brush")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("song") && guessedLetter.equals("song")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("jean") && guessedLetter.equals("jean")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("jeans") && guessedLetter.equals("jeans")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("base") && guessedLetter.equals("base")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("paper") && guessedLetter.equals("paper")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("fax") && guessedLetter.equals("fax")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("look") && guessedLetter.equals("look")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("grace") && guessedLetter.equals("grace")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("surpass") && guessedLetter.equals("surpass")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("skate") && guessedLetter.equals("skate")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                    if (currentWord.equals("sydana") && guessedLetter.equals("sydana")) {
                        System.out.println(printMan(hangMan, true));
                        break;
                    }
                }
                System.out.println("Would you like to play again?");
                playAgain = keyboard.nextLine().toLowerCase();
                if (playAgain.equals("yes")){
                    value = true;
                }
                else if (playAgain.equals("no")){
                    break;
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


            case 0:
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
                        message + "\nGame over.";
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