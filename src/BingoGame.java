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

    int[] BingoCard = new int[5];

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
                BingoCard[i] = Number;
                break;
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

    public void DrawNumber() {

    }

    public void CheckBingoCard() {

    }
}
