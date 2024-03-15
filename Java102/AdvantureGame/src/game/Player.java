package game;

import inventory.Inventory;
import profession.*;

import java.util.Scanner;

public class Player {
    private final Scanner scanner = new Scanner(System.in);
    private String name;
    private String profession;
    private Inventory inventory = new Inventory();
    private int damage;
    private int health;
    private int gold;
    private int maxHealth;

    public Player(String name) {
        this.name = name;
    }

    public void selectProfession() {
        Profession[] professions = {new Samurai(), new Archer(), new Knight()};
        for (Profession proff : professions) {
            System.out.println(proff.getId() + ". " + proff.getName()
                    + "\t Damage: " + proff.getDamage()
                    + "\t Health: " + proff.getHealth()
                    + "\t Gold: " + proff.getGold());
        }
        switch (scanner.nextInt()) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
    }

    public void showStats() {
        System.out.println("--------------Player Stats---------------");
        System.out.println(this.getName());
        System.out.println("\t" + this.getProfession() +
                "\tweapon: " + this.getInventory().getWeapon().getName() +
                "\tarmor: " + this.getInventory().getArmor().getName() +
                "\tdamage: " + this.getTotalDamage() +
                "\tdefense: " + this.getInventory().getArmor().getBlock() +
                "\thealth: " + this.getHealth() +
                "\tgold: " + this.getGold());
    }

    public void initPlayer(Profession profession) {
        this.setProfession(profession.getName());
        this.setDamage(profession.getDamage());
        this.setHealth(profession.getHealth());
        this.setMaxHealth(getHealth());
        this.setGold(profession.getGold());
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public boolean isAlive(){
        return this.getHealth() > 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
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

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
