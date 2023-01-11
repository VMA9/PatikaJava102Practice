package AdventureGame;

import java.util.Scanner;

public abstract class Location {
    protected Player p1;
    private String name;
    public static Scanner input = new Scanner(System.in);

    public Location(Player p1, String name) {
        this.p1 = p1;
        this.name = name;
    }
    public abstract boolean onLocation();

    public Player getP1() {
        return p1;
    }

    public void setP1(Player p1) {
        this.p1 = p1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
