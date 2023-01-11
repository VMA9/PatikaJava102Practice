package AdventureGame;

public class Inventory{
    private Weapon weapon;
    private Armor armor;
    private boolean food;
    private boolean water;
    private boolean fireWood;
    private boolean treasure;

    public Inventory() {
        this.weapon = new Weapon("Fist", -1,0,0);
        this.armor = new Armor(-1, "Rag",0,0);
        this.food = false;
        this.water = false;
        this.fireWood = false;
        this.treasure = false;
    }
    public boolean isFood(){
        return food;
    }
    public boolean isWater(){
        return water;
    }
    public boolean isFireWood(){
        return fireWood;
    }
    public boolean isTreasure(){
        return treasure;
    }

    public void setTreasure(boolean treasure) {
        this.treasure = treasure;
    }


    public void setFood(boolean food) {
        this.food = food;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public void setFireWood(boolean fireWood) {
        this.fireWood = fireWood;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    }
