public class BoundedCounter {
    private int value;
    private int upperLimit;



    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        this.value++;
    }

    public String toString() {
        return this.value + "";
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int changeValue) {
        this.value = changeValue;
    }
}