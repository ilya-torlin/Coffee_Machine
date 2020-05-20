package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        CoffeeMachineImpl coffeeMachine = new CoffeeMachineImpl(400, 540, 120, 9, 550);
        coffeeMachine.init();
    }
}

class CoffeeMachineImpl {
    int water;
    int milk;
    int bean;
    int cups;
    int money;
    Scanner scanner;

    public CoffeeMachineImpl(int water, int milk, int bean, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.bean = bean;
        this.cups = cups;
        this.money = money;
        this.scanner = new Scanner(System.in);
    }

    public void init() {
        caseAction();
    }

    private void displayCoffeeMachineState() {
        System.out.println("The coffee machine has:");
        System.out.println(this.water + " of water");
        System.out.println(this.milk + " of milk");
        System.out.println(this.bean + " of coffee beans");
        System.out.println(this.cups + " of disposable cups");
        System.out.println("$" + this.money + " of money");
        System.out.println(" ");
    }

    private void caseAction() {
        String action;
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = this.scanner.next();
            switch (action) {
                case "buy":
                    buyCoffee();
                    break;
                case "fill":
                    fillCoffeeMachine();
                    break;
                case "take":
                    takeMoney();
                    break;
                case "remaining":
                    displayCoffeeMachineState();
            }
        } while (!action.equals("exit"));
    }

    private void takeMoney() {
        System.out.println("I gave you $" + this.money);
        this.money = 0;
    }

    private void fillCoffeeMachine() {
        System.out.println("Write how many ml of water do you want to add:");
        this.water += this.scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        this.milk += this.scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        this.bean += this.scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        this.cups += this.scanner.nextInt();
    }

    private void buyCoffee() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String coffeeType = this.scanner.next();
        switch (coffeeType) {
            case "1":
                getCoffee(250, 0, 16, 4);
                break;
            case "2":
                getCoffee(350, 75, 20, 7);
                break;
            case "3":
                getCoffee(200, 100, 12, 6);
                break;
            case "back":
                break;
            default:
                System.out.println("Unknown type of coffee, back to menu");
        }
    }

    private void getCoffee(int water, int milk, int bean, int money) {
        String resources = hasResources(water, milk, bean);
        if (resources.isEmpty()) {
            this.water -= water;
            this.milk -= milk;
            this.bean -= bean;
            this.cups--;
            this.money += money;
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            System.out.println("Sorry, not enough " + resources + "!");
        }
    }

    private String hasResources(int water, int milk, int bean) {
        if (this.water - water < 0) {
            return "water";
        }
        if (this.milk - milk < 0) {
            return "milk";
        }
        if (this.bean - bean < 0) {
            return "beans";
        }
        if (this.cups - 1 < 0) {
            return "cups";
        }
        return "";
    }
}
