package AdventureGame;

import java.util.Scanner;

public class Game {
    private final Scanner input = new Scanner(System.in);

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
            if (p1.getInv1().isFireWood() && p1.getInv1().isFood() && p1.getInv1().isWater()) {
                System.out.println("""                               
                        ----------------------------
                        Congratulations, you won the game !
                        ----------------------------\s""");
                break;
            }
            System.out.print("""

                    ----------Regions---------- :\s

                    1. Safe House\t--> This is a Safe House for you, there are no enemies !
                    2. Tool Store\t--> You can buy Weapons or Armor !
                    3. Cave\t--> Go to the Cave, be careful, the zombie may come out! Award <Food>
                    4. Forest\t--> Go to the Forest, the vampire may come out! Award <Wood>
                    5. River\t--> Go to the River, the bear may come out! Award <Water>
                    6. Mine\t--> Go to the Mine, the snake may come out! Award <Item drop chance>
                    0. Sign out\t--> End the game !
                    Please select the region you want to go to :\s""");
            int selectLocation = input.nextInt();
            switch (selectLocation) {
                case 0:
                    System.out.println("Game over. We would love to see you again with us !");
                    return;
                case 1:
                    l1 = new SafeHouse(p1);
                    break;
                case 2:
                    l1 = new ToolStore(p1);
                    break;
                case 3:
                    if (p1.getInv1().isFood()) {
                        System.out.println("\nYou've already won the prize in the cave. You can 't go back in there !\n");
                        return;
                    }
                    l1 = new Cave(p1);
                    break;
                case 4:
                    if (p1.getInv1().isFireWood()) {
                        System.out.println("\nYou've already won the prize in the forest. You can 't go back in there !\n");
                        return;
                    }
                    l1 = new Forest(p1);
                    break;
                case 5:
                    if (p1.getInv1().isWater()) {
                        System.out.println("\nYou've already won the prize in the river. You can 't go back in there !\n");
                        return;
                    }
                    l1 = new River(p1);
                    break;
                case 6:
                    if (p1.getInv1().isTreasure()) {
                        System.out.println("\nYou've already won the prize in the mine. You can 't go back in there !\n");
                        return;
                    }
                    l1 = new Mine(p1);
                    break;
                default:
                    System.out.println("Please enter a valid region !");
                    break;
            }

            if (!l1.onLocation()) {
                System.out.println("Game Over !");
                break;
            }

        }
    }
}
