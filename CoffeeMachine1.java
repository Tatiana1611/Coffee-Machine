import java.util.Scanner;

public class CoffeeMachine1 {
    public static void main(String[] args) {
        Machine coffeeMachine = new Machine();
        coffeeMachine.initializeIngredients();
        boolean flag = true;
        while(flag) {
            coffeeMachine.executeState(MachineState.MAIN);
            if(!coffeeMachine.statusMachine()){
                flag = false;
            }
        }
    }

}



