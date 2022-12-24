package AdventureGame;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to Adventure Game !");
        System.out.print("Please enter a name : ");
        //String playerName = input.nextLine();
        Player p1 = new Player("Ali");
        System.out.println(p1.getPlayerName() + " welcome to the game");
        System.out.println("Please select a character (ID): " +
                "\n----------------------------------------------");
        p1.selectChar();

        Location l1 = null;
        while (true) {
            p1.printInfo();
            System.out.print("\n----------Regions---------- : \n" +
                    "\n1. Safe House\t--> This is a Safe House for you, there are no enemies !" +
                    "\n2. Tool Store\t--> You can buy Weapons or Armor !" +
                    "\n3. Cave\t--> Go to the Cave, be careful, the zombie may come out! Award <Food>" +
                    "\n4. Forest\t--> Go to the Forest, the vampire may come out! Award <Wood>" +
                    "\n5. River\t--> Go to the River, the bear may come out! Award <Water>" +
                    "\n0. Sign out\t--> End the game !" +
                    "\nPlease select the region you want to go to : ");
            int selectLocation = input.nextInt();
            switch (selectLocation) {
                case 0:
                    l1 = null;
                    break;
                case 1:
                    l1 = new SafeHouse(p1);
                    break;
                case 2:
                    l1 = new ToolStore(p1);
                    break;
                case 3:
                    l1 = new Cave(p1);
                    break;
                case 4:
                    l1 = new Forest(p1);
                    break;
                case 5:
                    l1 = new River(p1);
                    break;
                default:
                    System.out.println("Please enter a valid region !");
            }
            if (l1 == null) {
                System.out.println("The game is over, we are waiting for you again.");
                break;
            }
            if (!l1.onLocation()) {
                System.out.println("Game Over !");
                break;
            }

        }
    }
}
