package abstract_factory;

public class PixelPlayer extends Player{
    private int resolution;


    public PixelPlayer(String name, String description, int stamina, int recoveryRate,int resolution) {
        super(name, description, stamina, recoveryRate);
        this.resolution=resolution;
    }

    public int getResolution() {
        return resolution;
    }
}
