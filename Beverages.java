public enum Beverages {
    ESPRESSO(250,0,16,1,4),
    LATTE(350,70,20,1,7),
    CAPPUCCINO(200,100,12,1,6);

    private int water;
    private int milk;
    private int coffeeBeans;
    private int disposableCups;
    private int price;

    Beverages(int water, int milk, int coffeeBeans, int disposableCups, int price) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.disposableCups = disposableCups;
        this.price = price;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getDisposableCups() {
        return disposableCups;
    }

    public int getPrice() {
        return price;
    }


}
