import java.util.Scanner;

/**
 * Created by Михаил on 31.10.2016.
 */
public class RentTrailers {
    public static void main(String[] args) {
        new RentTrailers().run();
    }

    public void run() {
        MainMenu();
    }

    public void MainMenu() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("******************************************");
            System.out.println("* Trailer rental");
            System.out.println("******************************************");
            System.out.println("* 1) Rent small trailer");
            System.out.println("* 2) Rent large trailer");
            System.out.println("* 3) Overview");
            System.out.println("* 9) Exit");
            System.out.println("******************************************");
            System.out.print("Select an option: ");
            int Choice = scanner.nextInt();
            if (Choice == 1) {
                RentSmallTrailer();
                continue;
            }
            if (Choice == 2) {
                RentLargeTrailer();
                continue;
            }
            if (Choice == 3) {
                Overview();
                continue;
            }
            if (Choice == 9) {
                System.exit(0);
            }
        }
    }

    int SmallTrailers = 5;
    int RentedSmallTrailers = 0;
    String[] SmallTrailersRenters = new String[5];

    public void RentSmallTrailer() {
        if (SmallTrailers == 0) {
            System.out.println("Unfortunately, there are no small trailers available!");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the last name of the customer? ");
        String LastName = scanner.next();

        System.out.print("What is the weight of the load (in kg)? ");
        int Weight = scanner.nextInt();
        if (Weight > 750) {
            System.out.println("Warning! The maximum load (750 kg) is exceeded by " + (Weight - 750) + "kg!");
            while (true) {
                System.out.print("Are you sure you want to rent the trailer (y/n)? ");
                String yesorno = scanner.next();
                char c = yesorno.charAt(0);
                if (c == 'n') {
                    return;
                }
                if (c == 'y') {
                    break;
                }
            }
        }
        SmallTrailersRenters[RentedSmallTrailers] = LastName;
        RentedSmallTrailers++;
        SmallTrailers--;

    }


    int LargeTrailers = 3;
    int LargeTrailersRented = 0;
    String[] LargeTrailerRenters = new String[5];

    public void RentLargeTrailer() {
        if (LargeTrailers == 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Unfortunately, all large trailers are out!.");
            while (true) {
                System.out.print("Would you like to rent a small trailer instead (y/n)? ");
                String yesorno = scanner.next();
                char c = yesorno.charAt(0);
                if (c == 'n') {
                    return;
                }
                if (c == 'y') {
                    RentSmallTrailer();
                    return;
                }
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the last name of the customer? ");
        String LastName = scanner.next();

        while (true) {
            System.out.print("Is the driver in possession of an E-type drivers license (y/n)? ");
            String yesorno = scanner.next();
            char c = yesorno.charAt(0);
            if (c == 'n') {
                System.out.println("Unfortunately, a large trailer cannot be rented without a E-type drivers license");
                return;
            }
            if (c == 'y') {
                break;
            }
        }

        System.out.print("What is the weight of the load (in kg)? ");
        int Weight = scanner.nextInt();
        if (Weight > 3000) {
            System.out.println("Warning! The maximum load (3000 kg) is exceeded by " + (Weight - 3000) + "kg");
            while (true) {
                System.out.print("Are you sure you want to rent the trailer (y/n)? ");
                String yesorno = scanner.next();
                char c = yesorno.charAt(0);
                if (c == 'n') {
                    return;
                }
                if (c == 'y') {
                    break;
                }
            }
        }
        LargeTrailerRenters[LargeTrailersRented] = LastName;
        LargeTrailers--;
        LargeTrailersRented++;
    }

    public void Overview() {
        System.out.println("Rented small trailers: ");
        for (int i = 0; i < RentedSmallTrailers; i++) {
            System.out.println("    Small trailer " + (i + 1) + ": " + SmallTrailersRenters[i]);
        }
        System.out.println("There are " + SmallTrailers + " out of 5 small trailers available");
        System.out.println();
        System.out.println("Rented large trailers:");
        for (int i = 0; i < LargeTrailersRented; i++) {
            System.out.println("    Large trailer " + (i + 1) + ": " + LargeTrailerRenters[i]);
        }
        System.out.println("There are " + LargeTrailers + " out of 3 large trailers available");
        System.out.println();
        System.out.println("There are " + (SmallTrailers + LargeTrailers) + " trailers available in total.");
    }
}
