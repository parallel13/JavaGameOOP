package Unit;

public class BaseUnit {
    protected String name;
    protected String family;
    protected int healthPoint;
    protected int[] damage;
    protected int armor;
    protected int speed;
    protected float luck;


    public BaseUnit(String name, String family, int healthPoint, int[] damage, int armor, int speed, float luck) {
        this.name = name;
        this.family = family;
        this.healthPoint = healthPoint;
        this.damage = damage;
        this.armor = armor;
        this.speed = speed;
        this.luck = luck;
    }
    void attac(){

    }
    void await(){

    }
    void step(){

    }
    void defend(){

    }
    void getDamage(){

    }
    void die(){

    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getArmor() {
        return armor;
    }

    public int getSpeed() {
        return speed;
    }

    public float getLuck() {
        return luck;
    }
}
