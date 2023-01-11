package AdventureGame;

public class Mine extends BattleLocation{
    public Mine(Player player){
        super(player,"Mine",new Snake(),"Treasure", 5);
    }
}
