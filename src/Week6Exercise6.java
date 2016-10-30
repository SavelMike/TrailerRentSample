/**
 * Created by Михаил on 25.10.2016.
 */
public class Week6Exercise6 {
    public static void main(String[] args) {
        new Week6Exercise6().run();
    }

    public void run() {
        double[] Array = {3.1, 6.6, 7.5};
        System.out.println(averageNum(Array));
    }

    public double averageNum (double[] numbers){
        double Sum = 0;
        for (int i = 0; i < numbers.length; i++){
            Sum = Sum + numbers[i];
        }
    return Sum / numbers.length;
    }


}


