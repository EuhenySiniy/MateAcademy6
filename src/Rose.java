public class Rose extends Flower {
    public static final int PRICE = 100;

    public Rose() {
        super(this.PRICE);
    }

    @Override
    public String toString() {
        return "Rose";
    }
}
