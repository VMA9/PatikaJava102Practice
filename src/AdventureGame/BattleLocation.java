package AdventureGame;

import java.util.Random;
import java.util.Scanner;

public class BattleLocation extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    private Scanner input = new Scanner(System.in);

    public BattleLocation(Player p1, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(p1, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;

    }

    @Override
    public boolean onLocation() {
        int obstacleNumber = this.randomObstacleNumber();
        System.out.println("You are here now : " + this.getName());
        System.out.println("Be careful ! " + obstacleNumber + " units " + this.getObstacle().getName() + " lives here.");
        System.out.print("Fight(1) or Flight(2)");
        String selectBattleCase = input.nextLine().toUpperCase();
        if (selectBattleCase.equals("1") && combat(obstacleNumber)) {
            System.out.println(this.getName() + " you have defeated all the enemies.");
            return true;
        }
        if (this.getP1().getHealth() <= 0) {
            System.out.println("You are dead !");
            return false;
        }
        return true;
    }

    public boolean combat(int obstacleNumber) {
        for (int i = 1; i <= obstacleNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
            playerStats();
            obstacleStats(i);
            while (this.getP1().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                System.out.print("Attack(1) or Escape(2)");
                String selectCombat = input.nextLine().toUpperCase();
                if (selectCombat.equals("1")) {
                    System.out.println(this.getP1().getPlayerName() + " shot.");
                    this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getP1().getTotalDamage());
                    afterHit();
                    if (this.getObstacle().getHealth() > 0) {
                        System.out.println("\n" + this.getObstacle().getName() + " shot.");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getP1().getInv1().getArmor().getBlock();
                        if (obstacleDamage < 0) {
                            obstacleDamage = 0;
                        }
                        this.getP1().setHealth(this.getP1().getHealth() - obstacleDamage);
                    }
                } else {
                    return false;
                }
            }
            if (this.getObstacle().getHealth() < this.getP1().getHealth()) {
                System.out.println("You have defeated the enemy!" +
                        "\n" + this.getObstacle().getAward() + " money earned!");
                this.getP1().setMoney(this.getP1().getMoney() + this.getObstacle().getAward());
                System.out.println("Your current money : " + this.getP1().getMoney());
            } else {
                return false;
            }
        }
        return true;
    }

    public void afterHit() {
        System.out.println("Your Health Value : " + this.getP1().getHealth());
        System.out.println(this.getObstacle().getName() + " Health : " + this.getObstacle().getHealth() + "\n");

    }

    public void playerStats() {
        System.out.print("Player Status " +
                "\n------------" +
                "\nHealth : " + this.getP1().getHealth() +
                "\nWeapon : " + this.getP1().getInv1().getWeapon().getName() +
                "\nDamage : " + this.getP1().getTotalDamage() +
                "\nArmor : " + this.getP1().getInv1().getArmor().getName() +
                "\nBlock : " + this.getP1().getInv1().getArmor().getBlock() +
                "\nMoney : " + this.getP1().getMoney());

    }

    public void obstacleStats(int i) {
        System.out.println("\n\n" +
                i + "." + this.getObstacle().getName() + " Values" +
                "\n------------" +
                "\nHealth : " + this.getObstacle().getHealth() +
                "\nDamage : " + this.getObstacle().getDamage() +
                "\nAward : " + this.getObstacle().getAward());
    }

    public int randomObstacleNumber() {
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
}
