import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
public class Week10Exercise2{
    public static void main(String[] args) {
        new Week10Exercise2().run();
    }

    public void run(){
        MainMenu();
    }

    public void MainMenu() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("******************************************");
            System.out.println("* Trailer rental");
            System.out.println("******************************************");
            System.out.println("* 1) Rent small trailer");
            System.out.println("* 2) Rent large trailer");
            System.out.println("* 3) Overview");
            System.out.println("* 9) Exit");
            System.out.println("******************************************");
            System.out.print("Select an option:");

            int choice = in.nextInt();
            if (choice == 1) {
                rentSmallTrailer();
                continue;
            }

            if (choice == 2) {
                rentLargeTrailer();
                continue;
            }

            if (choice == 3) {
                OverviewDisplay();
                continue;
            }

            if (choice == 9) {
                return;
            }
        }
    }

    int SmallTrailers = 5;
    int LargeTrailers = 3;
    int SmallTrailerRented = 0;
    int LargeTrailerRented = 0;
    String[] SmallTrailersRenters = new String[5];
    String[] LargeTrailersRenters = new String[3];

    public void rentSmallTrailer() {
        if (SmallTrailers == 0) {
            System.out.println("Unfortunately, there are no small trailers available!");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the last name of the customer? ");
        String LastName = scanner.next();
        System.out.print("What is the weight of the load (in kg)? ");
        Double Weight = scanner.nextDouble();
        if (Weight > 750) {
            System.out.println("Warning! The maximum load (750 kg) is exceeded by " + (Weight - 750) + " kg!");
            while (true) {
                System.out.print("Are you sure you want to rent the trailer (y/n)? ");
                String input = scanner.next();
                char answer = input.charAt(0);
                if (answer == 'n')
                    return;
                if (answer == 'y') {
                    break;
                }
            }
        }
        SmallTrailers--;
        SmallTrailersRenters[SmallTrailerRented] = LastName;
        SmallTrailerRented++;
    }

    public void rentLargeTrailer()
    {
        System.out.println(LargeTrailers);
    }

    public void OverviewDisplay()
    {
        System.out.println("Rented small trailers: ");
        for (int i = 0; i < SmallTrailerRented; i ++) {
            System.out.println("     Small trailer " + (i + 1)+": " + SmallTrailersRenters[i] );
        }
        System.out.println("There are " + SmallTrailers + " out of 5 small trailers still available.");
        System.out.println("Rented large trailers:");
        for (int i = 0; i < LargeTrailerRented; i++) {
            System.out.println("     Large trailer " + (i + 1) + ": " + LargeTrailersRenters[i]);
        }
        System.out.println("There are " + LargeTrailers + " out of 3 large trailers still available.");
        System.out.println("There are " + (SmallTrailers + LargeTrailers) + " trailers available in total.");
    }
}
