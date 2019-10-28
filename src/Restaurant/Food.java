package Restaurant;

public class Food {

    private double price;
    private String name;
    private String ingredientList[]; //syntax for storing data: IngredientName*count (String*int), comma-separated
    private int ingCount = 0;

    public Food(String n, double p) {
        name = n;
        price = p;
    }

    public int getIngCount() {
        return ingCount;
    }
    public void incIngCount(int i) {
        ingCount = ingCount + i;
    }

    public void addIngredient(Ingredient i, int c) {
        /*
        for (int i = 0; i > 0; i++){
            //add a method of adding ingredients using the above syntax for storing the data in an array
            //each field in the array indicates a different ingredient and a count of each
            String field = n + "*" + c;
        }
         */
        ingredientList[getIngCount()] = i.getName() + "*" + c;
        incIngCount(1);
    }

    public String getIngredientList() {
        return ingredientList[0];
    }


}
