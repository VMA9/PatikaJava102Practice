package AdventureGame;

import javax.tools.Tool;
import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int originalHealth;
    private int money;
    private String playerName;
    private String charName;
    private Scanner input = new Scanner(System.in);
    private Inventory inv1;

    public Player(String playerName) {
        this.playerName = playerName;
        this.inv1 = new Inventory();
    }

    public void selectChar() {
        /*Samurai s1 = new Samurai();
        Knight k1 = new Knight();
        Archer a1 = new Archer();
        polymorphism sayesinde üstekini yazmak yerine bir alt satırdakiyle işlemi yapabiliriz.*/
        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Characters");
        System.out.println("----------------------------------------------");
        for (GameChar gameChar1 : charList) {
            System.out.println("ID : " + gameChar1.getId() +
                    "\t Character : " + gameChar1.getCharName() +
                    "\t Damage : " + gameChar1.getDamage() +
                    "\t Health : " + gameChar1.getHealth() +
                    "\t Money : " + gameChar1.getMoney());
        }
        System.out.println("----------------------------------------------");

        int selectChar = input.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Knight());
        }
        System.out.println("Character : " + this.getCharName() +
                "\t Damage : " + this.getDamage() +
                "\t Health : " + this.getHealth() +
                "\t Money : " + this.getMoney());

        /*System.out.println("GameChar : Sumurai \t Damage : 5 \t Health : 21 \t Money : 15");
        System.out.println("GameChar : Sumurai \t Damage : 5 \t Health : 21 \t Money : 15");
        System.out.println("GameChar : Sumurai \t Damage : 5 \t Health : 21 \t Money : 15");
        Bu üç satırı yazmamak için üsteki foreach yapısını kullanabiliriz. */
    }

    public void initPlayer(GameChar gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setOriginalHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getCharName());
    }

    public void printInfo() {
        System.out.println("Your weapon : " + this.getInv1().getWeapon().getName() +
                "\t Your Armor : " + this.getInv1().getArmor().getName() +
                "\t Block : " + this.getInv1().getArmor().getBlock() +
                "\t Damage : " + this.getTotalDamage() +
                "\t Health : " + this.getHealth() +
                "\t Money : " + this.getMoney());
    }

    public int getTotalDamage() {
        return damage + this.getInv1().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public Inventory getInv1() {
        return inv1;
    }

    public void setInv1(Inventory inv1) {
        this.inv1 = inv1;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}
