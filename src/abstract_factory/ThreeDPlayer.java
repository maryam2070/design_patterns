package abstract_factory;

public class ThreeDPlayer extends Player{
    private int renderRate;


    public ThreeDPlayer(String name, String description, int stamina, int recoveryRate,int renderRate) {
        super(name, description, stamina, recoveryRate);
        this.renderRate=renderRate;
    }

    public int getRenderRate() {
        return renderRate;
    }
}
