public class BoxingRingMain {
    public static void main(String[] args) {
            Fighter marc = new Fighter("Marc" , 100 , 15, 90, 0);
            Fighter alex = new Fighter("Alex" , 95 , 10, 100, 0);
            Ring r = new Ring(marc,alex , 90 , 100);
            r.startFight();
    }
}
