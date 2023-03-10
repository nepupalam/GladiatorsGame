import java.util.Random;

public abstract class  fighter {

    private static int MaxHealth;
    private int health;
    private int attack;
    private int block;

    public static int getMaxHealth() {
        return MaxHealth;
    }

    public static void setMaxHealth(int maxHealth) {
        MaxHealth = maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public void hit(fighter target) {
        Random random = new Random();
        int ThisHit = random.nextInt(this.attack + 1) - target.block;
        if (ThisHit >= 0) {
            target.health = target.health - ThisHit;
        }
    }

    public boolean block(int unit) {
        if (unit == 0) {
            return false;
        }
        else {
            return true;
        }
    }





}
