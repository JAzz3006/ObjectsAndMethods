public class Basket {
    private static int allBasketsCount = 0;
    private static int allBasketsCost = 0;
    private static int allGoodsCount = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;
    private int goodsCount = 0;


    public Basket() {
        increaseCount(1);
        items = "Список товаров: ";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        this.goodsCount++;
        Basket.allBasketsCost = Basket.allBasketsCost + totalPrice;
        Basket.allGoodsCount++;

    }
    public Basket(String items, int totalPrice, double totalWeight) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        this.totalWeight = totalWeight;
        this.goodsCount++;
        Basket.allBasketsCost = Basket.allBasketsCost + totalPrice;
        Basket.allGoodsCount++;
    }

    public static int getAllBasketsCount() {
        return allBasketsCount;
    }

    public static void increaseCount(int count) {
        Basket.allBasketsCount = Basket.allBasketsCount + count;
    }

    public static int getAllBasketsCost() {
        return Basket.allBasketsCost;
    }

    public static int getAllGoodsCount() {
        return Basket.allGoodsCount;
    }

    public void add(String name, int price) {
        add(name, price, 1, 0);
    }

    public void add(String name, int price, double weight) {
        add(name, price, 1,weight);
    }


       public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + count * weight;
        goodsCount = goodsCount + count;
        setAllBasketsCost(count, price);
        setAllGoodsCount(count);
        items = items + "\n" + name + " - кол-во " +
            count + " шт. - цена за 1шт. " + price + ", вес 1 шт.: " + weight
                + "\nСтоимость товаров в корзине " + totalPrice +
                "\nОбщий вес товаров в корзине " + String.format("%.2f", totalWeight);
    }
    public static void setAllBasketsCost(int count, int price){
        Basket.allBasketsCost = Basket.allBasketsCost + count * price;
    }
    public static void setAllGoodsCount(int count){
        Basket.allGoodsCount = Basket.allGoodsCount + count;
    }
    public static float avgPriceCalc(){
        return (float) (Basket.allBasketsCost * 100) / Basket.allGoodsCount / 100f;
    }
    public static float avgBasketCost(){
        return (float) (Basket.allBasketsCost * 100) / Basket.allBasketsCount / 100f;
    }
    public void clear() {
        allBasketsCost = allBasketsCost - totalPrice;
        items = "";
        totalPrice = 0;
        Basket.allGoodsCount = Basket.allGoodsCount - goodsCount;

    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public int getGoodsCount(){
        return goodsCount;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
