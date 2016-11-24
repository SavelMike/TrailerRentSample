/**
 * Created by Михаил on 13.11.2016.
 */
public class Practice3 {
    public static void main(String[] args) {
        new Practice3().run();
    }
    public void run(){
        int[] Array = {2, 1, 4, 1, 0};
        int index = findMin(Array);
        System.out.println(index);
    }
    public int findMin(int[] Array){
        int min = Array[0];
        int minIndex = 0;
        for (int i = 0; i < Array.length; i++){
            if(min > Array[i]){
                min = Array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public void cutElement(int[] Array, int minIndex){

    }

}

