package location;

import creature.Werewolf;
import game.Player;

public class River extends DangerousLocation{
    public River(Player player) {
        super(player, "River", new Werewolf(), "water",2);
    }
}
