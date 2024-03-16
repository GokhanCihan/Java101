package location;

import game.Player;

public class Home extends SafeLocation{
    public Home(Player player) {
        super(player, "Home");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are inside your home");
        System.out.println("You gain your full health");
        this.getPlayer().setHealth(this.getPlayer().getMaxHealth());
        return true;
    }
}
