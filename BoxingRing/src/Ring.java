public class Ring {
    Fighter fighter1;
    Fighter fighter2;
    int minWeight;
    int maxWeight;

    Ring(Fighter fighter1, Fighter fighter2, int minWeight, int maxWeight) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void startFight() {
        if (isCompatible()) {
            while (fighter1.health > 0 && fighter2.health > 0) {
                System.out.println("======== NEW ROUND ===========");
                fighter2.health = fighter1.hit(fighter2);
                if (didWin()) {
                    break;
                }
                fighter1.health = fighter2.hit(fighter1);
                if (didWin()) {
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("Boxers are not in the same weight category!");
        }
    }

    private boolean isCompatible() {
        return (fighter1.weight >= minWeight && fighter1.weight <= maxWeight) && (fighter2.weight >= minWeight && fighter2.weight <= maxWeight);
    }

    private void printScore() {
        System.out.println("------------");
        System.out.println(fighter1.name + " health: " + fighter1.health);
        System.out.println(fighter2.name + " health: " + fighter2.health);
    }

    private boolean didWin() {
        if (fighter1.health == 0) {
            System.out.println("Winner: " + fighter2.name);
            return true;
        } else if (fighter2.health == 0) {
            System.out.println("Winner: " + fighter2.name);
            return true;
        }

        return false;
    }
}
