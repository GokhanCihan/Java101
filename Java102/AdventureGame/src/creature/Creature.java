package creature;

public class Creature {
    private String id;
    private String name;
    private int damage;
    private int health;
    private int lootAmount;
    private final int maxHealth;

    public Creature(String id, String name, int damage, int health, int lootAmount) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.maxHealth = health;
        this.lootAmount = lootAmount;
    }

    public int getLootAmount() {
        return lootAmount;
    }

    public void setLootAmount(int loot) {
        this.lootAmount = loot;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public boolean isAlive() {
        return this.getHealth() > 0;
    }

    public void showStats(){;
        System.out.println(
                "\tdamage: " + this.damage +
                        "\thealth: " + this.getHealth() +
                        "\tloot: " + this.getLootAmount()
        );
    }
}
