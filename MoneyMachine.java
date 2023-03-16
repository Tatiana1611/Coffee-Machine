public class MoneyMachine {
    private int money;

    public MoneyMachine() {

        this.money = money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void printMoney(){
        System.out.println("$" + money + " of money");
    }

    public void addMoney(int price){
        this.money +=  price;
        System.out.println(this.money);
    }
    public void takeMoney(){
        int total = this.money;
        this.money = 0;
        System.out.println("Here is your money $" + total);

    }
}
