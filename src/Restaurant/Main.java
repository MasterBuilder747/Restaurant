package Restaurant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("===Restaurant Menu Creator===");
        System.out.println("Enter a name for your restaurant:" );
        String RName = kb.next();
        System.out.println("Your restaurant name is: " + RName);

        //add ingredients
        Ingredient americanCheese = new Ingredient("American Cheese");
        Ingredient beefPatty = new Ingredient("Beef Patty");
        Ingredient whiteBun = new Ingredient("White Bun");

        //add food items
        Food hamburger = new Food("Burger", 1.00);
        hamburger.addIngredient(americanCheese, 1);
        hamburger.addIngredient(whiteBun, 2);
        hamburger.addIngredient(beefPatty, 1);

        System.out.println("A burger has: " + hamburger.getIngredientList());

    }

}
