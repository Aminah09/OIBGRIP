import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void numGuess() {

        Scanner scInput=new Scanner(System.in);
        Random random = new Random();

        int rand_no = random.nextInt(100);
        rand_no += 1;

        int guess,play_again;
        int attempts=0,points=0;

        System.out.println("\n********** WELCOME TO NUMBER GUESSING GAME **********");


        while( attempts<10 ){

            System.out.print("\nGuess the Number: ");
            guess=scInput.nextInt();

            if(guess>rand_no) {
                System.out.println("Sorry! The number to be guessed is less than "+guess);
            }

            else if(guess<rand_no) {
                System.out.println("Sorry! The number to be guessed is greater than "+guess);
            }

            else {
                points+=100-(10*(attempts));
                System.out.println("\nGreat !! You guessed the number");
                System.out.println("\nThe number is "+guess);
                System.out.println("You score is : "+points);
                System.out.print("\n********* Game *********\n   | 1. Play again |\n   | 2. Exit       |\n\n Choice :  ");
                play_again=scInput.nextInt();

                if(play_again==1) {
                    numGuess();
                }

                else {
                    System.out.println("\nThank you!! Play Again...");
                    break;
                }
            }
            attempts+=1;
        }
        if(attempts==10) {

            points=0;
            System.out.println("\nYou are out of chances! Better luck next time");
            System.out.println("\nYour score: "+points);
            System.out.println("\nThe number You have missed is "+rand_no);
            System.out.print("\n********* Game *********\n   | 1. Play again |\n   | 2. Exit       |\n\n Choice :  ");
            play_again=scInput.nextInt();

            if(play_again==1) {

                numGuess();
            }
            else {

                System.out.println("Thank You!! Play Again...");
            }
        }
        scInput.close();

    }
    public static void main(String args[]) {

        numGuess();
    }
}
