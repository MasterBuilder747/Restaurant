package Restaurant;

class Menu {

    private String name;
    //object that holds food items
    //can have limited availability depending on: season, time of day
    private String avail; //s for seasonal, m for monthly, t for time of day, 0 for none
    private String availRange; //range of time (in XX:XX military, or XX-XX-XX for date in MM-DD-YY), 0 for none

    Menu(String n/*, String a, String aR*/) {
        name = n;
        //avail = a;
        //availRange = aR;
    }

    private Food[] foodList = new Food[256]; //food items in that menu (an array of classes!)

    //getters
    String getName() {
        return name;
    }

    //setters
    //food items get initialized here
    void addFood(int id, String n, double p) {
        foodList[id] = new Food(n, p);
    }
}
