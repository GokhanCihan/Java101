package inventory;

import java.util.Objects;

public class Armor {
    private String id;
    private String name;
    private int block;
    private int price;

    public Armor(String id, String name, int block, int price) {
        this.id = id;
        this.name = name;
        this.block = block;
        this.price = price;
    }

    public static Armor[] armors(){
        return new Armor[]{
                new Armor("1", "greaves and gloves",2,15),
                new Armor("2", "chest piece",3,25),
                new Armor("3", "shield",7,35)
        };
    }

    public static Armor getArmorByID(String id){
        for (Armor armor: Armor.armors()){
            if(Objects.equals(armor.getId(), id)){
                return armor;
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

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
