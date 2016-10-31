import java.util.Random;
import java.util.Scanner;

/**
 * Created by Михаил on 30.10.2016.
 */
public class BingoGame {
    public static void main(String[] args) {
        new BingoGame().run();
    }

    public void run() {
        MainMenu();
    }

    public void MainMenu() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("**********************");
            System.out.println("* BINGO");
            System.out.println("**********************");
            System.out.println("* 1) Create a Bingo card");
            System.out.println("* 2) Draw a number");
            System.out.println("* 3) Check Bingo card");
            System.out.println("* 9) Exit ");
            System.out.println("**********************");
            System.out.println();
            System.out.print("Select a menu option: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                createBingoCard();
                continue;
            }

            if (choice == 2) {
                DrawNumber();
                continue;
            }

            if (choice == 3) {
                CheckBingoCard();
                continue;
            }

            if (choice == 9) {
                return;
            }
            System.out.println("Invalid option. Try again.");
        }
    }

    int[] BingoCard = {0, 0, 0, 0, 0};
    boolean[] Covered = {false, false, false, false, false};

    public void  createBingoCard() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < BingoCard.length; i ++) {
            while (true) {
                System.out.print("Enter a value for field " + (i + 1) + ": " );
                int Number = scanner.nextInt();
                if (Number > 19) { // Assuming 0 and 20 are exclusive.
                    System.out.println("The entered value is too high! All values must be between 0 and 20.");
                    continue;
                }
                if (Number < 1) {
                    System.out.println("The entered value is too low! All values must be between 0 and 20.");
                    continue;
                }

                boolean Matches = false;
                for (int j = 0; j < BingoCard.length; j++) {
                    if (Number == BingoCard[j]) {
                        System.out.println("The number " + Number + " is already on your Bingo card. Choose a different value.");
                        Matches = true;
                        break;
                    }
                }
                if (Matches == false) {
                    BingoCard[i] = Number;
                    break;
                }
            }
        }

        System.out.print("Your Bingo card contains the numbers: [ ");
        for (int i = 0; i < BingoCard.length; i++) {
            if (i == BingoCard.length - 1) {
                System.out.println(BingoCard[i] + " ]");
            } else {
                System.out.print(BingoCard[i] + ", ");
            }
        }
    }

    public void printBingoCard() {
        System.out.print("Your Bingo card: [ ");
        for (int i = 0; i < BingoCard.length; i++) {
            if (Covered[i] == true) {
                System.out.print("(" + BingoCard[i] + ")");
            } else {
                System.out.print(BingoCard[i]);
            }
            if (i == BingoCard.length - 1) {
                System.out.println(" ]");
            } else {
                System.out.print(", ");
            }
        }
    }

    int[] DrawnNumbers = new int[19];
    int DrawnAmount = 0;
    int turnsAmount = 0;

    public void DrawNumber() {
        if (BingoCard[0] == 0) {
            System.out.println("You must first create a Bingo card before drawing a number!");
            return;
        }

        int RandomNumber;
        while (true) {
            RandomNumber = (1 + (int) (Math.random() * 19)); // Get random number between [1 to 19]
            boolean Found = false;
            for (int i = 0; i < DrawnAmount; i++) {
                if (DrawnNumbers[i] == RandomNumber) {
                    Found = true;
                    break;
                }
            }
            if (Found == true) {
                continue;
            }
            DrawnNumbers[DrawnAmount] = RandomNumber;
            DrawnAmount++;
            break;
        }
        System.out.println("A number is drawn! The ball reads the number: " + RandomNumber + "!");
        turnsAmount++;

        for (int i = 0; i < BingoCard.length; i++) {
            if (BingoCard[i] == RandomNumber) {
                Covered[i] = true;
            }
        }
        printBingoCard();
    }

    public void CheckBingoCard() {
        printBingoCard();
        for (int i = 0; i < Covered.length; i++) {
            if (Covered[i] == false) {
                System.out.println("Unfortunately you don’t have Bingo yet!");
                return;
            }
        }
        System.out.println("BINGO! All numbers are marked in " + turnsAmount + "turns.");
        System.exit(0);
    }
}
