package builder;

import chicken_sandwich.*;

import java.util.List;

public class ChickenSandwich implements Product{

    private Bun bun;
    private Cheese cheese;
    private Sauce sauce;
    private FriedChicken chicken;
    private List<SandwichExtras> extras;

    private ChickenSandwich(Bun bun, Cheese cheese, Sauce sauce, FriedChicken chicken, List<SandwichExtras> extras) {
        this.bun = bun;
        this.cheese = cheese;
        this.sauce = sauce;
        this.chicken = chicken;
        this.extras = extras;
    }

    @Override
    public String toString() {
        return "ChickenSandwich{" +
                "bun=" + bun +
                ", cheese=" + cheese +
                ", sauce=" + sauce +
                ", chicken=" + chicken +
                ", extras=" + extras +
                '}';
    }

    public static class ChickenSandwichBuilder implements Builder{
        private Bun bun;
        private Cheese cheese;
        private Sauce sauce;
        private FriedChicken chicken;
        private List<SandwichExtras> extras;

        public void setBun(Bun bun) {
            this.bun = bun;
        }

        public void setCheese(Cheese cheese) {
            this.cheese = cheese;
        }

        public void setSauce(Sauce sauce) {
            this.sauce = sauce;
        }

        public void setChicken(FriedChicken chicken) {
            this.chicken = chicken;
        }

        public void setExtras(List<SandwichExtras> extras) {
            this.extras = extras;
        }

        public ChickenSandwich build(){
            return new ChickenSandwich(
                    this.bun,
                    this.cheese,
                    this.sauce,
                    this.chicken,
                    this.extras
            );
        }
    }
}
