package abstract_factory;

import method_factory.creator.MysteryBox;

public class PlayerFactory {
    Player createPlayer(GameTypes type) {
        if (type == GameTypes.PIXEL) {
            return new PixelPlayer("name", "description", 100, 100, 100);
        } else {
            return new ThreeDPlayer("name", "description", 100, 100, 100);
        }
    }
}
