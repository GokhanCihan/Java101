package inventory;

import java.util.Objects;

public class Weapon {
    private String id;
    private String name;
    private int damage;
    private int price;

    public Weapon(String id, String name, int damage, int price) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.price = price;
    }

    public static Weapon[] weapons(){
        return new Weapon[]{
                new Weapon("1", "shiruken",2,15),
                new Weapon("2", "katana",3,25),
                new Weapon("3", "gun",7,35)
        };
    }

    public static Weapon getWeaponByID(String id){
        for (Weapon weapon: Weapon.weapons()){
            if(Objects.equals(weapon.getId(), id)){
                return weapon;
            }
        }

        return null;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
