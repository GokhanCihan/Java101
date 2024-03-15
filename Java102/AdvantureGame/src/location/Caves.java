package location;
import creature.Zombie;
import game.Player;

public class Caves extends DangerousLocation{
    public Caves(Player player) {
        super(player, "Caves", new Zombie(), "food", 3);
    }
}
