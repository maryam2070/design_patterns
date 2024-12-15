package method_factory.creator;

import method_factory.product.GameItem;
import method_factory.product.ShieldItem;

public class GoldenMysteryBox extends MysteryBox{
    @Override
    GameItem createGameItem() {
        return new ShieldItem(
                "dumpling shield",
                "powerful to protect, fun to eat(can burn your tongue with hot broth).",
                400,
                4500
        );
    }
}
