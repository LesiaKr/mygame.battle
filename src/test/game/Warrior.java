package test.game;

public class Warrior {

    private String name;
    private String weapon;
    private int hp;
    private int power;

    public Warrior(String name, String weapon, int power, int hp){
        this.name = name;
        this.weapon = weapon;
        this.power = power;
        this.hp = hp;
    }
    public void attack (Warrior target) {
            target.hp -= this.power;
            System.out.println(this.name + " поцілив у " + target.name);
            System.out.println(target.name + " hp: " + target.hp);

           if (target.hp <= 0) {
               System.out.println(target.name + " помер");
           }
    }
    public String getWeapon() {
        return weapon;
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }
}
