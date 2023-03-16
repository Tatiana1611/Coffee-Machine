import java.util.Scanner;

public class Machine extends MoneyMachine {

    private int water;
    private int milk;
    private int coffeeBeans;
    private int disposableCups;

    public Machine(int water, int milk, int coffeeBeans, int disposableCups) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.disposableCups = disposableCups;
    }

    public Machine() {
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

    public void setWater(int water) {
        this.water += water;
    }

    public void setMilk(int milk) {
        this.milk += milk;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans += coffeeBeans;
    }

    public void setDisposableCups(int disposableCups) {
        this.disposableCups += disposableCups;
    }

    public void printListOfIngredients() {
        System.out.println(" The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
    }

    public boolean statusMachine() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().toLowerCase();

        switch (input) {
            case "fill":
                executeState(MachineState.REFILL_WATER);
                executeState(MachineState.REFILL_MILK);
                executeState(MachineState.REFILL_COFFEE);
                executeState(MachineState.REFILL_CUPS);
                return true;

            case "take":
                executeState(MachineState.TAKE_MONEY);
                return true;

            case "buy":
                Scanner scannerOrder = new Scanner(System.in);
                System.out.println("""
                        What do you want to buy? 
                        1 - espresso, 
                        2 - latte, 
                        3 - cappuccino, 
                        4 - go back to main menu""");
                String order = scannerOrder.nextLine();
                if (order == "4") {
                    executeState(MachineState.valueOf(String.valueOf((MachineState.MAIN))));
                } else {
                    buyCoffee(order);
                }
                return true;

            case "remaining":
                executeState(MachineState.CHECK_INGREDIENTS);
                return true;

            case "exit":
                return false;
            default:
                System.out.println("INCORRECT");
                return true;
        }
    }

    public boolean executeState(MachineState state) {
        Scanner scanner = new Scanner(System.in);
        MoneyMachine money = new MoneyMachine();

        switch (state) {
            case MAIN:
                System.out.println("""
                        Please choose:
                        - fill
                        - take
                        - buy
                        - remaining
                        - exit  """);
                System.out.println();
                return true;
            case CHECK_INGREDIENTS:
                printListOfIngredients();
                System.out.println();
                money.printMoney();
                return true;
            case MAKE_COFFEE:
                statusMachine();
                return true;
            case TAKE_MONEY:
                takeMoney();
                return true;
            case REFILL_WATER:
                System.out.println("Write how many ml of water you want to add: ");
                int waterAdded = scanner.nextInt();
                System.out.println();
                setWater(waterAdded);
                state = MachineState.REFILL_MILK;
                return true;
            case REFILL_MILK:
                System.out.println("Write how many ml of milk you want to add: ");
                int milkAdded = scanner.nextInt();
                System.out.println();
                setMilk(milkAdded);
                state = MachineState.REFILL_COFFEE;
                return true;
            case REFILL_COFFEE:
                System.out.println("Write how many g of coffee beans you want to add: ");
                int coffeeBeansAdded = scanner.nextInt();
                System.out.println();
                setCoffeeBeans(coffeeBeansAdded);
                state = MachineState.REFILL_CUPS;
                return true;
            case REFILL_CUPS:
                System.out.println("Write how many cups you want to add: ");
                int disposableCupsAdded = scanner.nextInt();
                setDisposableCups(disposableCupsAdded);
                state = MachineState.MAIN;
                return true;
            case TURN_OFF:
                return false;
            default:
                return true;

        }
    }


    public void buyCoffee(String order) {
        Beverages drinkType;


        switch (order) {
            case "1":
                drinkType = Beverages.ESPRESSO;
                makeCoffee(drinkType);
                break;
            case "2":
                drinkType = Beverages.LATTE;
                makeCoffee(drinkType);
                break;
            case "3":
                drinkType = Beverages.CAPPUCCINO;
                makeCoffee(drinkType);
                break;
            case "4":
                executeState(MachineState.MAIN);
                break;
            default:
                System.out.println("INCORRECT");
                break;
        }
    }

    public void makeCoffee(Beverages drinkType) {
        MoneyMachine money = new MoneyMachine();
        if (water < drinkType.getWater()) {
            System.out.println("Sorry, not enought water!");
            return;
        }
        if (milk < drinkType.getMilk()) {
            System.out.println("Sorry, not enough milk!");
            return;
        }
        if (coffeeBeans < drinkType.getCoffeeBeans()) {
            System.out.println("Sorry, not enough coffee beans!");
            return;
        }
        if (disposableCups < drinkType.getDisposableCups()) {
            System.out.println("Sorry, not enough disposable cups!");
            return;
        }

        setWater(-drinkType.getWater());
        setMilk(-drinkType.getMilk());
        setCoffeeBeans(-drinkType.getCoffeeBeans());
        setDisposableCups(-drinkType.getDisposableCups());
        addMoney(drinkType.getPrice());
        System.out.print("Here is your " + drinkType.name() + ".Enjoy!");
        System.out.println();
    }

    public void initializeIngredients(){
        water = 550;
        milk = 450;
        coffeeBeans = 70;
        disposableCups = 5;
    }
}
