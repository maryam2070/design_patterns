package singlton;

import builder.ChickenSandwich;

public class FriedChickenSandwichSingleton {
    private static ChickenSandwich instance=null;

    private FriedChickenSandwichSingleton(){

    }

    public static ChickenSandwich get(){
        if(instance==null) {
            instance = new ChickenSandwich();
        }
        return instance;
    }
}
