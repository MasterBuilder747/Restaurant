package Restaurant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        //tier system: restaurant > menu > food > ingredient
        //for now, there is only one restaurant per instance


        System.out.println("===Restaurant Menu Creator===");
        System.out.println("Enter a name for your restaurant:" );
        String RName = kb.next();
        System.out.println("Your restaurant name is: " + RName);

        /*
        //home menu
        System.out.println("HOME: Menus selection (all lower case):");
        System.out.println("\tm:menu menu");
        System.out.println("\tf: food items");
        System.out.println("\ti: ingredients");
        System.out.println("\to: other info");
        System.out.println(" ");

        //ingredient menu
        System.out.println("=Ingredient Menu=");
        System.out.println("\ta: add new");
        System.out.println("\ts: show list of ingredients");
        System.out.println("\te: edit an ingredient");
        System.out.println(" ");

        //food menu
        System.out.println("=Food menu=");
        System.out.println("\ta: add new");
        System.out.println("\te: edit a food item");
        System.out.println("\ts: show list of food items");
        System.out.println(" ");

        //menu menu
        System.out.println("=Menu menu");
        System.out.println("\ta: add new menu");
        System.out.println("\ts: show list of menus");
        System.out.println("\tm: show a menu's availability");
        System.out.println("\te: edit an existing menu");
        System.out.println(" ");
        */

        //First try to add a menu, put food items in that, then add ingredients to that
        //then add modifying and adding more
        System.out.println("Add a new menu: ");


        //add ingredients
        Ingredient americanCheese = new Ingredient("American Cheese", "milk, enzymes, salt, oil");
        Ingredient beefPatty = new Ingredient("Beef Patty", "grinded cow insides");
        Ingredient whiteBun = new Ingredient("White Bun", "flour, salt, sugar, baking soda, butter, oil");

        //add food items
        Food hamburger = new Food("Burger", 1.00);
        hamburger.addIngredient(0, 1, americanCheese);
        hamburger.addIngredient(1, 2, whiteBun);
        hamburger.addIngredient(2, 1, beefPatty);

        System.out.println("A " + hamburger.getFoodName() + " costs " + hamburger.getFoodPrice() + "$ and has: " + hamburger.getIngredientCount(0)+ " " + hamburger.getIngredientName(0) + "s.");

        System.out.println("This is what is in our " + beefPatty.getName() + ": " + beefPatty.getIngredientList() + ".");
    }

    Menu[] menuList = new Menu[8];
    public void addMenu(int id, String n, String a, String aR) {
        Menu m = new Menu(n, a, aR);
        menuList[id] = m;
    }

}
