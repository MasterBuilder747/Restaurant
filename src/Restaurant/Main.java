package Restaurant;

import java.util.Scanner;

public class Main {

    public static Menu[] menuList = new Menu[8];
    static void addMenu(int i, String n/*String a, String r*/) {
        menuList[i] = new Menu(n);
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        //tier system: restaurant > menu > food > ingredient
        //for now, there is only one restaurant per instance
        /*
        System.out.println("===Restaurant Menu Creator===");
        System.out.println("Enter a name for your restaurant:" );
        String RName = kb.next();
        System.out.println("Your restaurant name is: " + RName);
        */

        //add a new menu, adding each one with an id and a name in menuList
        //user can have up to 8 menus
        //availability will be implemented later
        System.out.println("Add a new menu? [y/n]");
        String choice = kb.next();
        if (choice != "n") {
            if (choice != "y") {
                System.out.println("Wrong input.");
            }
        }
        int id = 0;
        while (choice == "y" || id < 8) {
            System.out.println("Enter the name of the menu: ");
            String n = kb.next();
            /*
            System.out.println("Is there limited availability? Type 0 for no.");
            String a = kb.next();
            System.out.println("otherwise type: s for seasonal, m for month, w for week, or t for daily time based availability");
            String r = kb.next();
             */
            addMenu(id, n);
            System.out.println("Menu" + id + "is called " + n);
            id++;

            if (id == 7) {
                System.out.println("Add a new menu? [y/n]");
                choice = kb.next();
                if (choice == "y") {
                    System.out.println("You have entered the maximum amount of menus.");
                }
            }else{
                System.out.println("Add a new menu? [y/n]");
                choice = kb.next();
            }
        }

        //add food items to menu
        //later this will be a category
        id = 0;
        System.out.println("Enter the name of the food being added to the menu" + menuList[id].getName() + ": ");
        String n = kb.next();
        System.out.println("Enter the price of the food in US dollars: ");
        double p = kb.nextDouble();
        menuList[0].addFood(id, n, p);
        System.out.println(n + "s cost $" + p + ".");


        /*
        legacy code, will delete when not needed

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

        /*
        //First try to add a menu, put food items in that, then add ingredients to that
        //then add modifying and adding more
        System.out.println("Add a new menu: ");
        System.out.println("Enter the name of the menu: ");
        int id = 0;
        String name = kb.next();
        System.out.println("Is there limited availability? Type 0 for no.");
        System.out.println("otherwise type: s for seasonal, m for month, w for week, or t for daily time based availability");
        String ava = kb.next();
        System.out.println("Enter the range of the availability, 0 if there is no availability: ");
        System.out.println("range letters: ");
        String avaR = kb.next();
        addMenu(id, name, ava, avaR);

        //add food items
        System.out.println("Enter the food item's name: ");
        //id will be handled later (id of menu, and food, and ingredients)
        int menuID = 0;
        int foodID = 0;
        String foodName = kb.next();
        double price = kb.nextDouble();
        menuList[menuID].addFood(foodID, foodName, price);

        System.out.println("For this food item, what are the ingredients?");
        int ingID = 0;
        System.out.println("Enter the name of the ingredient");
        String ingName = kb.next();
        System.out.println("Enter the ingredients of this ingredient, if there is nothing more than itself, put the same name: ");
        String ingList = kb.next();
        menuList[menuID].foodList[foodID].addIngredient(ingID, ingName, ingList);
        */

        /*
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
        */

        }
}