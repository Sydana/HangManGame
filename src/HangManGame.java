import java.util.Scanner;

public class HangManGame {
    public static void main(String[] args) {
        Scanner keyboard;
        int score = 0;
        String guessedLetter;
        boolean value = true;
        String playAgain = "";
        String[] chosenWord = {"pour", "knowledge", "cook", "wry", "best"};
        keyboard = new Scanner(System.in);

        System.out.println("This is the Hang Man Game. These are the rules.");
        System.out.println("There is going to be a word that you have to guess by guessing the letters that make up said word.");
        System.out.println("You get fifteen tries to do so. If you win, you gain a point.\nYou could see your score at the end of the game, where you could choose to restart the game.");
        System.out.println("Let's get started, guess a letter.");
        guessedLetter = keyboard.nextLine();

        while (value) {
            if (chosenWord.equals("pour")){
                if(guessedLetter.equals("p")||guessedLetter.equals("o")||guessedLetter.equals("u")||guessedLetter.equals("r")){



                }
            }







                        }
    }
}
 public static String printMan(int tries, boolean win, String guessedLetter, String chosenWord){}
