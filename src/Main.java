import builder.ChickenSandwich;
import chicken_sandwich.*;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final ChickenSandwich.ChickenSandwichBuilder builder = new ChickenSandwich.ChickenSandwichBuilder();
        builder.setBun(Bun.FLATBREAD);
        builder.setCheese(Cheese.AMERICAN);
        builder.setChicken(FriedChicken.BONELESS);
        builder.setSauce(Sauce.NO_SAUCE);
        java.util.List<SandwichExtras> extras = new ArrayList<>();
        extras.add(SandwichExtras.AVOCADO);
        extras.add(SandwichExtras.BACON);
        builder.setExtras(extras);
        final ChickenSandwich c=builder.build();
        System.out.println(c.toString());
    }
}