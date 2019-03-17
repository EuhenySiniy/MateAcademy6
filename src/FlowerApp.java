public class FlowerApp {
    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();
        flowerStore.sell(2, 3, 1);
        flowerStore.giveBouquet();
        System.out.println(flowerStore.getWallet() + "$");
        flowerStore.sellSequence(3, 2, 1);
        flowerStore.giveBouquet();
        System.out.println(flowerStore.getWallet());
    }
}
