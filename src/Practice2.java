/**
 * Created by Михаил on 12.11.2016.
 */
public class Practice2 {
    public static void main(String[] args) {
        new Practice2().run();
    }

    public void run(){
        int[] orgArray = {1, 3, 5, 6, 7, 8, 9};
        int tmp = 0;
        for (int i = 0, j = orgArray.length - 1; i < (orgArray.length / 2); i++, j--){
            tmp = orgArray[i];
            orgArray[i] = orgArray[j];
            orgArray[j] = tmp;
        }
        for (int j = 0; j < orgArray.length; j++){
            System.out.print(orgArray[j]);
        }
    }
}
