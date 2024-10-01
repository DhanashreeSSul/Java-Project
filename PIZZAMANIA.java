import java.util.Scanner;

public class PIZZAMANIA {
    public static void main(String[] args) {
        System.out.println("_____________________***PIZZAMANIA***_________________________ ");
        System.out.println("WHICH PIZZA?:\n1. VEG PIZZA\n2.NON-VEG PIZZA\n3. DELUX VEG PIZZA\n4. DELUX NON-VEG PIZZA");

        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                pizza vegPizza = new pizza(true);
                vegPizza.addExtraToppings();
                vegPizza.addExtraCheese();
                vegPizza.takeAway();
                vegPizza.getBill();
                break;
            case 2:
                pizza nonvegPizza = new pizza(false);
                nonvegPizza.addExtraToppings();
                nonvegPizza.addExtraCheese();
                nonvegPizza.takeAway();
                nonvegPizza.getBill();
                break;
            case 3:
                DeluxPizza veg = new DeluxPizza(true);
                veg.basePizzaPrice = 550;
                veg.addExtraToppings();
                veg.addExtraCheese();
                veg.takeAway();
                veg.getBill();
                break;
            case 4:
                DeluxPizza nonveg = new DeluxPizza(false);
                nonveg.basePizzaPrice = 650;
                nonveg.addExtraToppings();
                nonveg.addExtraCheese();
                nonveg.takeAway();
                nonveg.getBill();
                break;
            default:
                System.out.println("SORRY ENTER AGAIN!!!");
                return;
        }
        sc.close();
    }
}