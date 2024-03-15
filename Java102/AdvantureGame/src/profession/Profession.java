package profession;

public abstract class Profession {
    private String id;
    private String name;
    private int damage;
    private int health;
    private int gold;

    public Profession(String id, String name, int damage, int health, int gold) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.gold = gold;
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

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
