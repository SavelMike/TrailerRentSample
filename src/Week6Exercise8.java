import java.util.Scanner;

public class Week6Exercise8 {
    public static void main (String[] args) {
        new Week6Exercise8().run();
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.next();
        String reverText = reverse(inputText);
        boolean res = inputText.equals(reverText);
        System.out.println(res);
    }

    public String reverse(String input) {
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }
        return result;
    }
}
