package Unit;

import java.util.ArrayList;

public abstract class FighterUnits extends BaseUnit {
    protected int attackLength;
    protected float chanceOfDodging;


    public FighterUnits(String name, String family, float healthPoint, float maxHealthPoint, int attack, int armor, int speed, float luck,
                        ArrayList<BaseUnit> team, int attackLength, float chanceOfDodging) {
        super(name, family, healthPoint, maxHealthPoint, attack, armor, speed, luck, team);
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
