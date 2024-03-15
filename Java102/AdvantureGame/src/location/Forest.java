package location;

import creature.Vampire;
import game.Player;

public class Forest extends DangerousLocation {
    public Forest(Player player) {
        super(player, "Forest", new Vampire(), "Wood", 3);
    }
}
