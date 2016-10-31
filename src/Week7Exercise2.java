import java.util.Scanner;

/**
 * Created by Михаил on 31.10.2016.
 */
public class Week7Exercise2 {
    public static void main(String[] args) {
        new Week7Exercise2().run();
    }

    public void run() {
        MainMenu();
    }

    public void MainMenu() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("****************");
            System.out.println("*   Drawings!  *");
            System.out.println("****************");
            System.out.println("* 1) Draw a house");
            System.out.println("* 2) Draw (half) a pyramid");
            System.out.println("* 3) Draw a full pyramid");
            System.out.println("* 0) Exit");
            System.out.println("*****************");
            System.out.print("Your choice? ");
            int Choice = scanner.nextInt();
            if (Choice == 1) {
                IDrawHouse();
            }
            if (Choice == 2) {
                IDrawHalfPyramid();
            }
            if (Choice == 3) {
                IDrawFullPyramid();
            }
            if (Choice == 0) {
                System.exit(0);
            }
        }
    }

    public void IDrawHouse() {
        System.out.println("not ready");
        return;
    }

    public void IDrawHalfPyramid() {
        System.out.println("not ready yet");
        return;
    }

    public void IDrawFullPyramid() {
        System.out.println("not ready, yet");
    }

}
