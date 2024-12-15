package method_factory.creator;

import method_factory.product.GameItem;
import method_factory.product.Material;
import method_factory.product.SwordItem;

public class WoodenMysteryBox extends MysteryBox{

    @Override
    GameItem createGameItem() {
        return new SwordItem(
                "nah bro sword",
                "cut fruits, can be upgraded to 1000 points if you have someone loves you",
                400,
                Material.BRONZE
        );
    }
}
