package factory.product;

public class ShieldItem extends GameItem {
    private int protectionLevel;

    public ShieldItem(String name, String description, int points, int protectionLevel) {
        super(name, description, points);
        this.protectionLevel = protectionLevel;
    }

    @Override
    void printItem() {
        System.out.println(super.toString() + " " + this.toString());
    }

    @Override
    public String toString() {
        return "ShieldItem{" +
                "protectionLevel=" + protectionLevel +
                '}';
    }
}
