import java.util.Scanner;

public class Week10SampleTest2 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        new Week10SampleTest2().run();

    }

    public int fiveNumbers = 1;
    public int[] nForBingo = new int[5];
    public int randomNumbersBingo = 0;
    public boolean win = false;
    public int i = 0;
    public int chooseNumber = 0;

    public void run() {
        while (!win) {
            BINGO();
        }
    }

    public int BINGO() {
        System.out.println();
        System.out.println(
                "****************************************** * BINGO ******************************************\n" +
                        "* 1) Create a Bingo card\n" +
                        "* 2) Draw a number\n" +
                        "* 3) Check Bingo card\n" +
                        "* 9) Exit ******************************************");
        System.out.print("Select a menu option: ");
        int option = scan.nextInt();
        if (option == 1) {
            return createBingo();
        } else if (option == 2) {
            return drawNumber();
        } else if (option == 3) {
            return checkBingoCard();
        } else if (option == 9) {
            win = true;
            return -1;
        }

        return BINGO();
    }

    public int createBingo() {

        for (; i < nForBingo.length; ) {
            System.out.print("Enter a value for field " + fiveNumbers + ": ");
            chooseNumber = scan.nextInt();
            if (chooseNumber > 20) {
                System.out.println("The entered value is too high! All values must be between 0 and 20.");
                return createBingo();
            } else if (chooseNumber < 0) {
                System.out.println("The entered value is too low! All values must be between 0 and 20.");
                return createBingo();
            } else {
                nForBingo[i] = chooseNumber;
                i++;
                fiveNumbers++;

            }
        }
        return BINGO();
    }

    public int drawNumber() {


        randomNumbersBingo = ((int) (Math.random() * 20));
        System.out.println("A number is drawn! The ball reads the number: " + randomNumbersBingo + "!");
        i=0;
        System.out.print("[");
        return brakes();
    }
    public int brakes(){
        for ( ; i < nForBingo.length; i++) {

            if (nForBingo[i] == randomNumbersBingo) {
                System.out.print("(");
                System.out.print( nForBingo[i]);
                System.out.print("), ");
                i++;
                return brakes();
            }

            System.out.print(nForBingo[i]);
            if (i<4){
                System.out.print(", ");
            }

        }
        System.out.print("]");

        return BINGO();
    }

    public int checkBingoCard() {
        return BINGO();
    }
}


