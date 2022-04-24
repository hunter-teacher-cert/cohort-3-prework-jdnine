import java.util.Random;
import java.util.Scanner;

public class Guess {

  public static void main(String[] args) {
    //pick a random number
    Random random = new Random();
    int number = random.nextInt(100) + 1;
    int typeNumber;
    Scanner in = new Scanner(System.in);

    System.out.print("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is? \n");
    //prompt for number
    System.out.print("Type a number: "); typeNumber = in.nextInt();
    //number confirmation
      System.out.print("Your guess is: " +typeNumber);
    //display random number
    System.out.print("\nThe number I was thinking of is: " +number);
    //display difference
    System.out.println("\nYou were off by: " +(number - typeNumber));
  }
}