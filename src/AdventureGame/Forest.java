package AdventureGame;

public class Forest extends BattleLocation{
    public Forest(Player p1) {
        super(p1,"Forest", new Vampire(),"Firewood",3);
    }
}
