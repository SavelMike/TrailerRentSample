/**
 * Created by Михаил on 12.11.2016.
 */
public class Practice1 {
    public static void main(String[] args) {
        new Practice1().run();
    }

    public void run() {
        int[] orgArray = {1, 3, 4, 6};
        int[] revArray = new int[4];
        int j = 0;
        for (int i = orgArray.length - 1; i >= 0; i--) {
            revArray[j] = orgArray[i];
            j++;
        }
        for (int i = 0; i < revArray.length; i++){
            System.out.print(revArray[i]);
        }
    }
}

