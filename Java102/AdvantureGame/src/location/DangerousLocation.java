package location;

import creature.Creature;
import game.*;

import java.util.Objects;
import java.util.Random;

public class DangerousLocation extends Location {
    private final Creature creature;
    private String loot;
    private final int maxCreature;

    public DangerousLocation(Player player, String name, Creature creature, String loot, int maxCreature) {
        super(player, name);
        this.maxCreature = maxCreature;
        this.creature = creature;
        this.loot = loot;

    }

    @Override
    public boolean onLocation() {
        int livingCreatures = this.randomCreatureNumb();
        System.out.println("You are on " + this.getName());
        System.out.println("Be aware of the " + this.getCreatureType() + "s");
        System.out.println("Living: " + livingCreatures);
        System.out.println("1. Fight!!!");
        System.out.println("2. Run away");
        int selected = scanner.nextInt();
        switch (selected) {
            case 1:
                return this.fight(livingCreatures,this.getCreature(), this.getPlayer());
            case 2:
                System.out.println("Running away...");
                break;
            default:
                System.out.println("invalid selection");
        }
        return true;
    }

    //fight creatures one at a time
    public boolean fight(int numberOfOpponents, Creature creature, Player player) {
        for (int i = 1; i <= numberOfOpponents; i++) {
            System.out.println("----------" + creature.getName() + " " + i + "----------");
            creature.setHealth(creature.getMaxHealth());
            creature.showStats();
            player.showStats();
            while (player.isAlive() && creature.isAlive()) {
                System.out.println("1. Hit");
                System.out.println("2. Run");
                String selected = scanner.next();
                if (Objects.equals(selected, "1")) {
                    this.hit(creature, player);
                    this.hit(player, creature);
                }else {
                    return true;
                }
            }
            if (!player.isAlive()){
                return false;
            }
            if (!creature.isAlive()){
                System.out.println("You win.");
                player.setGold(player.getGold() + creature.getLootAmount());
            }
        }
        System.out.println("Cleared all " + this.getCreatureType() + " in the " + this.getName());
        return true;
    }

    public void hit(Creature creature, Player player){
        if(creature.isAlive()){
            System.out.println(creature.getName()+ " hit you.");
            //damage cannot be negative
            int creatureDamage = Integer.max(creature.getDamage() - player.getInventory().getArmor().getBlock(), 0);
            //health cannot be negative
            player.setHealth(Integer.max(player.getHealth() - creatureDamage,0));
            System.out.println("Your health: " + player.getHealth());
        }
    }

    public void hit(Player player, Creature creature) {
        if (player.isAlive()) {
            System.out.println("You hit the " + creature.getName()+ ".");
            creature.setHealth(Integer.max(creature.getHealth() - player.getTotalDamage(), 0));

            System.out.println(creature.getName() + " health: " + creature.getHealth());
        }
    }

    public int randomCreatureNumb() {
        Random rnd = new Random();
        return rnd.nextInt(this.getMaxCreature()) + 1;
    }

    public String getLoot() {
        return loot;
    }

    public void setLoot(String loot) {
        this.loot = loot;
    }

    public int getMaxCreature() {
        return maxCreature;
    }

    public Creature getCreature() {
        return creature;
    }

    public String getCreatureType() {
        return this.getCreature().getName();
    }

}
