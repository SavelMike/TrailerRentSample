package Week2;

public class Counter {

    private int value;

    public void count() {
        value++;
    }

    public void undo() {
        if (value > 0) {
            value--;
        }
    }

    public int getValue() {
        return value;
    }
}
