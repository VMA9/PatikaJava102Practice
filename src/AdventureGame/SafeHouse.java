package AdventureGame;

public class SafeHouse extends NormalLocation{
    public SafeHouse(Player p1) {
        super(p1, "Safe House");
    }
    @Override
    public boolean onLocation(){
        System.out.println("You are in the safe house ! \nYour soul is renewed !");
        this.getP1().setHealth(this.getP1().getOriginalHealth());
        return true;
    }
}
