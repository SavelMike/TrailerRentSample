import java.util.Scanner;

public class Week04Exercise10 {
    public static void main(String[] args) {
        new Week04Exercise10().run();
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        System.out.println("Available sizes:");
        System.out.println("1 - Small (9 x 9)");
        System.out.println("2 - Medium (13 x 13)");
        System.out.println("3 - Large (19 x 19)");
        System.out.print("Please enter the size of the board to draw (1-3):");
        int choice = in.nextInt();
        int GridSize = 0;
        if (choice == 1) {
            GridSize = 9;
        } else if (choice == 2) {
            GridSize = 13;
        } else if (choice == 3) {
            GridSize = 19;
        } else {
            System.out.println("Invalid number, only 1, 2 and 3 supported");
            System.exit(1);
        }
        int i = 0;
        while (i < GridSize) {
            int j = 0;
            int p = 0;
            if (i != 0) {
                while (p < GridSize) {
                    if (p == 0) {
                        System.out.print("|");
                    } else {
                        System.out.print("  |");
                    }
                    p++;
                }
                System.out.println();
            }
            while (j < GridSize) {
                if (j == 0) {
                    System.out.print("+");
                }else {
                    System.out.print("--+");
                }
                j ++;
            }
            System.out.println();
            i ++;
        }

    }
}