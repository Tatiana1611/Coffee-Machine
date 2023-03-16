
import java.util.Scanner;

/*public class CoffeeMachine {
    int money;
    int water;
    int milk;
    int coffeeBeans;
    int disposableCups;

    public CoffeeMachine(int money, int water, int milk, int coffeeBeans, int disposableCups) {
        this.money = money;
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.disposableCups = disposableCups;

    }

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(550, 400, 540, 120, 9);

        boolean flag = true;


        while (flag) {
            System.out.println("Write action ( buy, fill, take, remaining, exit )");
            String command = coffeeMachine.addInput();

            switch (command) {
                case "fill":
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Write how many ml of water you want to add: ");
                    int waterAdded = sc.nextInt();
                    System.out.println("Write how many ml of milk you want to add: ");
                    int milkAdded = sc.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add: ");
                    int coffeeBeansAdded = sc.nextInt();
                    System.out.println("Write how many disposable cups you want to add: ");
                    int disposableCupsAdded = sc.nextInt();
                    coffeeMachine.addIngredients(waterAdded, milkAdded, coffeeBeansAdded, disposableCupsAdded);
                    break;
                case "take":
                    System.out.print("I gave you $" + coffeeMachine.money);
                    System.out.println();
                    coffeeMachine.money = 0;
                    break;
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
                        break;
                    } else {
                        coffeeMachine.checkIngredients(order);
                    }
                    break;
                case "remaining":
                    coffeeMachine.printListOfIngredients();
                    System.out.println();
                    break;
                case "exit":
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }


    public void checkIngredients(String order) {

        switch (order) {
            case "1":
                if (water >= 250) {
                    if (coffeeBeans >= 16) {
                        if (disposableCups >= 1) {
                            buyCoffee(order);
                        } else {
                            System.out.println("Sorry, not enought disposable cups");
                        }
                    } else {
                        System.out.println(" Sorry, not enough coffee beans");
                    }
                } else {
                    System.out.println(" Sorry, not enough  water");

                }
                break;
            case "2":
                if (water >= 350) {
                    if (milk >= 75) {
                        if (coffeeBeans >= 20) {
                            if (disposableCups >= 1) {
                                buyCoffee(order);
                            } else {
                                System.out.println("Sorry, not enought disposable cups");
                            }
                        } else {
                            System.out.println("Sorry, not enough coffee beans");
                        }
                    } else {
                        System.out.println(" Sorry, not enough coffee milk");
                    }
                } else {
                    System.out.println("Sorry, not enought water");
                }
                break;
            case "3":
                if (water >= 200) {
                    if (milk >= 100) {
                        if (coffeeBeans >= 12) {
                            if (disposableCups >= 1) {
                                buyCoffee(order);
                            } else {
                                System.out.println("Sorry, not enought disposable cups");
                            }
                        } else {
                            System.out.println("Sorry, not enough coffee beans");
                        }
                    } else {
                        System.out.println(" Sorry, not enough milk");
                    }
                } else {
                    System.out.println("Sorry, not enought water");
                }
                break;
            default:
                break;
        }

    }

    public void printListOfIngredients() {
        System.out.println(" The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + money + " of money");
    }



    public void buyCoffee(String order) {
        switch (order) {
            case "1":
                this.water -= 250;
                this.coffeeBeans -= 16;
                this.disposableCups -= 1;
                this.money += 4;
                System.out.print("Here is your coffe.Enoy" + "\n");
                break;
            case "2":
                this.water -= 350;
                this.milk -= 75;
                this.coffeeBeans -= 20;
                this.disposableCups -= 1;
                this.money += 7;
                System.out.print("Here is your coffe.Enoy" + "\n");
                break;
            case "3":
                this.water -= 200;
                this.milk -= 100;
                this.coffeeBeans -= 12;
                this.disposableCups -= 1;
                this.money += 6;
                System.out.print("Here is your coffe.Enoy" + "\n");
                break;
            default:
                break;
        }
    }
    public String addInput (){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return input;
    }
}
*/