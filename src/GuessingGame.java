import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class GuessingGame {
    //public static void GuessingGame(){
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello there, what's your name?");
        System.out.println("Type in your name here: ");

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        System.out.println(name + " I'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess my number.");

        Random rand = new Random();
        int number = rand.nextInt(100);
        int tries = 0;

        while(true){
            int guess;
            try {
                guess = input.nextInt();
            } catch (InputMismatchException e){
                String bad_input = input.next();
                System.out.println("You did not guess an integer. Please try again.");
                continue;
            }

            if(guess < 1 || guess > 100){
                System.out.println(guess + " is invalid. Please try again.");
                continue;
            }

            tries = tries + 1;

            if(guess < number){
                System.out.println("Your guess is low try again.");
            } else if (guess > number){
                System.out.println("Your guess is too high, try again.");
            } else {
                System.out.println("Well done, " + name);
                System.out.printf("You found my number in " + tries + " tries!");
                break;
            }
        }
    }
}
