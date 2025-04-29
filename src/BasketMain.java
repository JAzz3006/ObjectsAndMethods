public class BasketMain {
    public static void main(String[] args) {

        Basket b1 = new Basket("milk", 30);
        System.out.println(Basket.getAllBasketsCost() + " - all baskets' cost");
        Basket b2 = new Basket("Groceries", 120);
        System.out.println(Basket.getAllBasketsCost() + " - all baskets' cost");
        b1.clear();
        System.out.println(Basket.getAllBasketsCost() + " - all baskets' cost");
    }
}
