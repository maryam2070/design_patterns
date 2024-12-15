package factory.product;

public class SwordItem extends GameItem {
    private Material material;

    public SwordItem(String name, String description, int points, Material material) {
        super(name, description, points);
        this.material = material;
    }

    @Override
    void printItem() {

        System.out.println(
                super.toString()+" "+this.toString()
        );
    }

    @Override
    public String toString() {
        return "SwordItem{" +
                "material=" + material +
                '}';
    }

}


