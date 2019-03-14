import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlowerStore {
    private Flower[] bouquet;
    private int wallet;
    private int arrayOrder;

    public Flower[] sell(int roses, int tulipas, int chamomiles) {
        int flowers = roses + tulipas + chamomiles;
        bouquet = new Flower[flowers];
        arrayOrder = 0;
        for (int j = 0; j < roses; j++) {
            addFlower(new Rose(), arrayOrder++);
            addToWallet(new Rose());
        }
        for (int j = 0; j < tulipas; j++) {
            addFlower(new Tulipa(), arrayOrder++);
            addToWallet(new Tulipa());
        }
        for (int j = 0; j < chamomiles; j++) {
            addFlower(new Chamomile(), arrayOrder++);
            addToWallet(new Chamomile());
        }
        return bouquet;
    }

    public Flower[] sellSequence(int roses, int tulipas, int chamomiles) {
        int count = roses + tulipas + chamomiles;
        bouquet = new Flower[count];
        for (int j = 0; j < count; ) {
            if (roses > 0) {
                bouquet[j++] = new Rose();
                roses--;
                addToWallet(new Rose());
            }
            if (tulipas > 0) {
                bouquet[j++] = new Tulipa();
                tulipas--;
                addToWallet(new Tulipa());
            }
            if (chamomiles > 0) {
                bouquet[j++] = new Chamomile();
                chamomiles--;
                addToWallet(new Chamomile());
            }
        }
        return bouquet;
    }

    public void giveBouquet() {
        List<Flower> flowers = new ArrayList();
        flowers.addAll(Arrays.asList(bouquet));
        System.out.println(flowers);
    }

    private void addFlower(Flower type, int arrayOrder) {
        bouquet[arrayOrder] = type;
    }

    private void addToWallet(Flower type) {
        this.wallet += type.getPrice();
    }

    public int getWallet() {
        return wallet;
    }
}
