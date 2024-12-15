package factory.product;

public abstract class GameItem {
    private String name;
    private String description;
    private int points;

    public GameItem(String name, String description, int points) {
        this.name = name;
        this.description = description;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPoints() {
        return points;
    }


    @Override
    public String toString() {
        return "GameItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", points=" + points +
                '}';
    }

    abstract void printItem();
}
