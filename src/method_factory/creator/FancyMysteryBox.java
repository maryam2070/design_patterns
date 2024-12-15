package method_factory.creator;

import method_factory.product.GameItem;
import method_factory.product.Material;
import method_factory.product.SwordItem;

public class FancyMysteryBox extends MysteryBox{
    @Override
    GameItem createGameItem() {
        return new SwordItem(
                "nobody is gonna know sword",
                "cut your inner thoughts, i can help you get better life",
                400,
                Material.DIAMOND
        );
    }
}
