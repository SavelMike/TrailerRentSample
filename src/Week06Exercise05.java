import java.util.Scanner;

public class Week06Exercise05 {
    public static void main(String[] args) {
        new Week06Exercise05().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        String testString = scanner.next();

        System.out.println(reverse(testString));
    }

    public String reverse(String input) {
        String result = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }

        return result;
    }
}
