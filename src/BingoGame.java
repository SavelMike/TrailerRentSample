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

    public void  createBingoCard() {

    }

    public void DrawNumber() {

    }

    public void CheckBingoCard() {

    }
}
