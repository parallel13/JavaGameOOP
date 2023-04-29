package Unit;

import java.util.Arrays;

public abstract class Fighter extends BaseUnit {
    protected int attackLength;
    protected float chanceOfDodging;


    public Fighter(String name, String family, int healthPoint, int[] damage, int armor, int speed, float luck,
                   int attackLength, float chanceOfDodging) {
        super(name, family, healthPoint, damage, armor, speed, luck);
        this.attackLength = attackLength;
        this.chanceOfDodging = chanceOfDodging;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", attackLength=" + attackLength +
                ", chanceOfDodging=" + chanceOfDodging+"}";


    }

    public int getAttackLength() {
        return attackLength;
    }

    public float getChanceOfDodging() {
        return chanceOfDodging;
    }
}
