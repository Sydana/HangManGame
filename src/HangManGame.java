import java.util.Scanner;

public class HangManGame {
    public static void main(String[] args) {
        //, "knowledge", "cook", "wry", "best"
        // String[] chosenWord = {"pour"};
        // for (int i = 0; i < chosenWord.length; i++){
        Scanner keyboard;
        int hangMan;
        int score = 0;
        int notWinScore = 0;
        String guessedLetter;
        boolean value = true;
        String playAgain = "";
        String [] chosenWord = {"pour","feel", "cook", "wry", "best", "stove", "peep","nourish", "enlarge", "cough", "bed", "see", "degree", "island", "lethal", "utter", "tangy", "whisper", "crazy", "tedious",
                                "brush", "song", "jeans", "base", "paper", "fax", "look", "grace", "surpass", "skate", "sydana"};

        String currentWord;
        String currentAlpha;

        keyboard = new Scanner(System.in);

        while (value) {
        String [] alphabet = {"a ","b ","c ","d ","e ","f ","g ","h ","i ","j","\n","k ","l ","m ","n ","o ","p ","q ","r ","s ","t","\n","u ","v ","w ","x ","y ","z","\n"};
        hangMan = 0;

        System.out.println("This is the Hang Man Game. These are the rules.");
        System.out.println("There is going to be a word that you have to guess by guessing the letters that make up said word.");
        System.out.println("Now, once you think you have the word, type out the word to win.\nHere's the kicker, I'm not telling you which order the letters are in.");
        System.out.println("You get 8 tries to do so. If you win, you gain a point.\nYou could see your score at the end of the game, where you could choose to restart the game.");
        System.out.println("Let's get started.");
        int generatedNumber = (int) (Math.random() * chosenWord.length);

                currentWord = chosenWord[generatedNumber];

                if (currentWord.equals("wry")||currentWord.equals("bed")||currentWord.equals("see")||currentWord.equals("fax")){
                    System.out.println("There are three letters in this word.");
                }
                else if (currentWord.equals("pour")||currentWord.equals("feel")||currentWord.equals("cook")||currentWord.equals("best")||currentWord.equals("peep")||currentWord.equals("song") ||currentWord.equals("base")||currentWord.equals("look")){
                    System.out.println("There are four letters in this word.");
                }
                else if(currentWord.equals("stove")||currentWord.equals("cough")||currentWord.equals("utter")||currentWord.equals("tangy")||currentWord.equals("crazy")||currentWord.equals("brush") ||currentWord.equals("jeans")||currentWord.equals("paper")||currentWord.equals("grace")||currentWord.equals("skate")){
                    System.out.println("There are five letters in this word.");
                }
                else if(currentWord.equals("degree")||currentWord.equals("island")||currentWord.equals("lethal")||currentWord.equals("sydana")){
                    System.out.println("There are six letters in this word.");
                }
                else if(currentWord.equals("nourish")||currentWord.equals("enlarge")||currentWord.equals("whisper")||currentWord.equals("surpass")||currentWord.equals("tedious")){
                    System.out.println("There are seven letters in this word.");
                }//currentWord.equals("")||



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
                    if (hangMan > 7) {
                        value = false;
                        System.out.println(printMan(hangMan, false));
                        notWinScore++;
                        System.out.println("The answer was \"" + chosenWord[generatedNumber] + "\"");
                        System.out.println("Your score is: "+score+" points out of "+notWinScore+" games.");
                    }


                    if (currentWord.equalsIgnoreCase(guessedLetter)) {
                        System.out.println(printMan(hangMan, true));
                        score++;
                        System.out.println("Your score is: "+score+" points out of "+notWinScore+" games.");
                        break;
                    }

                    alphabet = Beta(alphabet,guessedLetter);
                    System.out.println(" ");
                    for(String letter: alphabet){
                        System.out.print(letter);
                    }
                    System.out.println(" ");

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
                         message;
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
                        message;
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
                        message;
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
                        message;
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
                        message;
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
                        message;
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
      return secretWord.contains(guessLetter.toLowerCase());

    }

    public static String[] Beta (String[] args, String currentGuess ) {
        for(int i=0;i<args.length;i++){
            if(args[i].contains(currentGuess)){
                args[i] = "_ ";
                return args;
            }

        }
        return args;

    }
}