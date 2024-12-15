package factory.creator;

import factory.product.GameItem;
import factory.product.Material;
import factory.product.SwordItem;

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
