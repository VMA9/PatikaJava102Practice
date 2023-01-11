package AdventureGame;

public class ToolStore extends NormalLocation {
    public ToolStore(Player p1) {
        super(p1, "Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to the store ! ");
        boolean showMenu = true;
        while (showMenu) {
            System.out.print("1. Weaponry " +
                    "\n2. Armors " +
                    "\n3. Log out " +
                    "\nYour choice : ");
            int selectCase = Location.input.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.print("Invalid value, try again : ");
                selectCase = input.nextInt();
            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("We are waiting for you again.");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("Weaponry ");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(
                    w.getId() +
                            " - " + w.getName() +
                            " < Money: " + w.getPrice() +
                            " , Damage : " + w.getDamage());
        }
        System.out.println("0 - Sign out. ");
    }

    public void buyWeapon() {
        System.out.print("Choose a weapon : ");

        int selectWeaponId = input.nextInt();
        while (selectWeaponId < 0 || selectWeaponId > Weapon.weapons().length) {
            System.out.print("Invalid value, try again : ");
            selectWeaponId = input.nextInt();
        }
        if (selectWeaponId != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponId);
            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getP1().getMoney()) {
                    System.out.println("You do not have enough money.");
                } else {
                    // area of purchase
                    System.out.println(selectedWeapon.getName() + " you bought the black.");
                    int balance = this.getP1().getMoney() - selectedWeapon.getPrice();
                    this.getP1().setMoney(balance);
                    System.out.println("Your remaining money : " + this.getP1().getMoney());
                    System.out.println("Your previous weapon : " + this.getP1().getInv1().getWeapon().getName());
                    this.getP1().getInv1().setWeapon(selectedWeapon);
                    System.out.println("Your new weapon : " + this.getP1().getInv1().getWeapon().getName());
                }
            }
        }
    }

    public void printArmor() {
        System.out.println("---Armors---");
        for (Armor a : Armor.armors()) {
            System.out.println(a.getId() +
                    " - " + a.getName() +
                    " < Money : " + a.getPrice() +
                    " Armor Value : " + a.getBlock());
        }
        System.out.println("0 - Sign out. ");
    }

    public void buyArmor() {
        System.out.print("Choose an armor : ");

        int selectArmorId = input.nextInt();
        while (selectArmorId < 0 || selectArmorId > Armor.armors().length) {
            System.out.print("Invalid value, try again : ");
            selectArmorId = input.nextInt();
        }
        if(selectArmorId != 0){
            Armor selectedArmor = Armor.getArmorObjById(selectArmorId);

            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getP1().getMoney()) {
                    System.out.println("You do not have enough money.");
                } else {
                    System.out.println(selectedArmor.getName() + " bought your armor.");
                    int balance = this.getP1().getMoney() - selectedArmor.getPrice();
                    this.getP1().setMoney(balance);
                    this.getP1().getInv1().setArmor(selectedArmor);
                    System.out.println("Your remaining money :" + this.getP1().getMoney());
                    System.out.println("Your previous armor : " + this.getP1().getInv1().getArmor().getName());
                }
            }
        }
    }
}
