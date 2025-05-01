public class BasketMain {
    public static void main(String[] args) {

        Basket b1 = new Basket("stationary", 200, 0.1);
        System.out.println(Basket.getAllGoodsCount() + " " + Basket.getAllBasketsCost());
        b1.add("Folder", 12,10, 0.05);
        System.out.println(Basket.getAllGoodsCount() + " " + Basket.getAllBasketsCost());
        Basket b2 = new Basket();
        b2.add("Bottle of milk", 40,6,0.6);
        System.out.println(Basket.getAllGoodsCount() + " " + Basket.getAllBasketsCost());
        //b1.clear();
        System.out.println(Basket.getAllGoodsCount() + " " + Basket.getAllBasketsCost());
        b2.print("Basket b2");
        System.out.println(560/Basket.getAllBasketsCount());
        System.out.println(String.format("%.2f", Basket.avgPriceCalc()) + " - средняя цена товаров в корзине");
        System.out.println(String.format("%.2f", Basket.avgBasketCost()) + " - средняя стоимость корзины");

    }
}
