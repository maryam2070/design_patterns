package abstract_factory;

public abstract class Player {
    private String name;
    private String description;
    private int stamina;
    private int recoveryRate;

    public Player(String name, String description, int stamina,int recoveryRate) {
        this.name = name;
        this.description = description;
        this.stamina = stamina;
        this.recoveryRate=recoveryRate;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getStamina() {
        return stamina;
    }

    public int getRecoveryRate() {
        return recoveryRate;
    }
}
