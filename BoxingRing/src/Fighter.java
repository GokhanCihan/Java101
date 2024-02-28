public class Fighter {
    String name;
    int weight;
    int damage;
    int health;
    double chance;

    public Fighter(String name, int weight, int damage, int health, double chance) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.chance = chance;
    }

    // Fix: no dodge?
    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " hit " + foe.name + ": " + this.damage + " damage.");

        if (foe.dodge()) {
            System.out.println(foe.name + " dodged.");
            return foe.health;
        }

        if (foe.health - this.damage < 0)
            return 0;

        return foe.health - this.damage;
    }

    private boolean dodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.chance;
    }

    public void setChance() {
        this.chance = Math.random() * 100;
    }
}
