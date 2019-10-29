package Restaurant;

public class Food {

    private double price;
    private String name;
    private int id;
    //syntax for storing data: IngredientName*count (String*int), comma-separated
    private String[] ingredientList = new String[32];

    public Food(String n, double p) {
        name = n;
        price = p;
    }

    public void addIngredient(int iid, int c, Ingredient i) {
        //iid must start with 0
        ingredientList[iid] = i.getName() + "*" + c;
    }

    public String getIngredientName(int id) {
        return ingredientList[id].substring(0, ingredientList[id].indexOf("*"));
    }
    public int getIngredientCount(int id) {
        String output = ingredientList[id].substring(ingredientList[id].indexOf("*") + 1);
        return Integer.parseInt(output);
    }

    public double getFoodPrice() {
        return price;
    }
    public String getFoodName() {
        return name;
    }


}
