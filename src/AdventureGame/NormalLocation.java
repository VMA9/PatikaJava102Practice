package AdventureGame;

public class NormalLocation extends Location {
    public NormalLocation(Player p1, String name){
        super(p1, name);

    }
    @Override
    public boolean onLocation(){
        return true;
    }
}
