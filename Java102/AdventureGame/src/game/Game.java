package game;

import location.*;

import java.util.Scanner;

public class Game {
    private final Scanner scanner = new Scanner(System.in);
    private Player player;

    public void play(){
        System.out.println("welcome to the game");
        System.out.println("Your name is...?");
        this.player = new Player(scanner.nextLine());
        System.out.println("Select a profession " + player.getName());
        player.selectProfession();
        player.showStats();
        Location location;
        while (true){

            System.out.println("---------Select a location to travel---------");
            System.out.println("1. Home");
            System.out.println("2. Market");
            System.out.println("3. Caves");
            System.out.println("4. Forest");
            System.out.println("5. River");
            System.out.println("0. !!End Game!!");

            // choose location to travel
            location = switch (scanner.nextInt()) {
                case 1 -> new Home(this.player);
                case 2 -> new Market(this.player);
                case 3 -> new Caves(this.player);
                case 4 -> new Forest(this.player);
                case 5 -> new River(this.player);
                case 0 -> null;
                default -> new Home(this.player);
            };
            if(location == null){
                System.out.println("You are leaving too soon :'(");
                break;
            }
            if (!location.onLocation()){
                System.out.println("Game Over");
                break;
            }
        }
    }
}
