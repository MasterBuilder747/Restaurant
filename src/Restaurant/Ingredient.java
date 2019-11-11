package Restaurant;

class Ingredient {

    private String name;
    private String ingredientList;

    Ingredient(String n, String il) {
        name = n;
        ingredientList = il;
    }
    String getName() {
        return name;
    }
    String getIngredientList() {
        return ingredientList;
    }
}