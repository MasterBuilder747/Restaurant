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
        hamburger.addIngredient(0, 1, americanCheese);
        hamburger.addIngredient(1, 2, whiteBun);
        hamburger.addIngredient(2, 1, beefPatty);

        System.out.println("A " + hamburger.getFoodName() + " costs " + hamburger.getFoodPrice() + "$ and has: " + hamburger.getIngredientCount(0)+ " " + hamburger.getIngredientName(0) + "s.");
    }

}
