package location;

import inventory.Armor;
import game.Player;
import inventory.Weapon;

public class Market extends SafeLocation {

    public Market(Player player) {
        super(player, "Market");
    }

    @Override
    public boolean onLocation() {
        System.out.println("----------You are on market----------");
        boolean showMenu = true;
        while (showMenu){
            System.out.println("1. Weapons");
            System.out.println("2. Armors");
            System.out.println("3. Leave");
            int selected = Location.scanner.nextInt();
            while (selected < 1 || selected > 3) {
                System.out.println("Invalid selection! Please select again.");
                selected = scanner.nextInt();

            }
            switch (selected) {
                case 1:
                    printWeapons();
                    buyWeapon();
                    break;
                case 2:
                    printArmors();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Leaving market. See you later...");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    private void printWeapons() {
        System.out.println("----------Select a Weapon---------");
        for (Weapon weapon : Weapon.weapons()) {
            System.out.println(weapon.getId() + ". " +
                    weapon.getName() + " -" +
                    " price: " + weapon.getPrice() +
                    " damage: " + weapon.getDamage()
            );
        }

    }

    private void printArmors() {
        System.out.println("----------Select an Armor----------");
        for (Armor armor : Armor.armors()) {
            System.out.println(armor.getId() + ". " +
                    armor.getName() + " -" +
                    " price: " + armor.getPrice() +
                    " block: " + armor.getBlock()
            );
        }
    }

    private void buyWeapon() {
        String selected = scanner.next();

        while (Integer.parseInt(selected)<1 ||  Integer.parseInt(selected) > Weapon.weapons().length){
            System.out.println("Invalid selection! Please select again.");
            selected = scanner.next();
        }

        Weapon selectedWeapon = Weapon.getWeaponByID(selected);
        if (selectedWeapon != null){
            if(selectedWeapon.getPrice()> this.getPlayer().getGold()){
                System.out.println("Not enough gold");
            }else {
                System.out.println("Bought " + selectedWeapon.getName());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);

                int newBalance = this.getPlayer().getGold() - selectedWeapon.getPrice();
                this.getPlayer().setGold(newBalance);

                System.out.println("Remaining gold: " + getPlayer().getGold());
            }
        }
    }

    private void buyArmor() {
        String selected = scanner.next();

        while (Integer.parseInt(selected)<1 ||  Integer.parseInt(selected) > Armor.armors().length){
            System.out.println("Invalid selection! Please select again.");
            selected = scanner.next();
        }

        Armor selectedArmor = Armor.getArmorByID(selected);
        if (selectedArmor != null){
            if(selectedArmor.getPrice()> this.getPlayer().getGold()){
                System.out.println("Not enough gold");
            }else {
                System.out.println("Bought " + selectedArmor.getName());
                this.getPlayer().getInventory().setArmor(selectedArmor);

                int newBalance = this.getPlayer().getGold() - selectedArmor.getPrice();
                this.getPlayer().setGold(newBalance);

                System.out.println("Remaining gold: " + getPlayer().getGold());
            }
        }
    }

}
