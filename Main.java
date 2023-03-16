import java.util.HashMap;
import java.util.Scanner;

/*public class Main {
    static HashMap<String, Integer> ingredients = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int waterQty = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkQty = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int coffeeBeansQty = scanner.nextInt();

        addIngredients(waterQty, milkQty, coffeeBeansQty);

        System.out.println("How many cups of coffee do you need?");

        int order1 = scanner.nextInt();
        checkIngredients(order1);


    }

    public static void makeCoffee(int number) {
        int water = 200 * number;
        int milk = 50 * number;
        int coffeeBeans = 15 * number;
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
    }

    public static void addIngredients(int water, int milk, int coffeeBeans, int disposableCups) {
        ingredients.put("water", water);
        ingredients.put("milk", milk);
        ingredients.put("coffee beans", coffeeBeans);
        ingredients.put("disposable cups", disposableCups);
        System.out.println(ingredients.toString());
    }

    public static void checkIngredients(int numberOfCoffees) {
        int waterPerCoffee = ingredients.get("water") / 200;
        int milkPerCoffee = ingredients.get("milk") / 50;
        int coffeeBeansPerCoffee = ingredients.get("coffee beans") / 15;
        int availableQuantity = 0;

        if (waterPerCoffee <= milkPerCoffee && milkPerCoffee <= coffeeBeansPerCoffee) {
            availableQuantity = waterPerCoffee;
        } else if (milkPerCoffee <= waterPerCoffee && waterPerCoffee <= coffeeBeansPerCoffee) {
            availableQuantity = milkPerCoffee;
        } else if (coffeeBeansPerCoffee <= waterPerCoffee && coffeeBeansPerCoffee <= milkPerCoffee) {
            availableQuantity = coffeeBeansPerCoffee;
        }

        System.out.println(availableQuantity);

        if (numberOfCoffees == availableQuantity) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (availableQuantity > numberOfCoffees) {
            System.out.println("Yes, I can make that amount of coffee ( and even "
                    + (availableQuantity - numberOfCoffees) + " more than that");
        } else {
            System.out.println("No, I can make only " + availableQuantity + " cups of coffee");
        }
    }
}*/