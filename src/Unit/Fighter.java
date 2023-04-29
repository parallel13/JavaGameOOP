package Unit;

import java.util.Arrays;

public class Fighter extends BaseUnit{
    protected int attackLength;
    protected float chanceOfDodging;



    public Fighter(String name, String family, int healthPoint, int[] damage, int armor, int speed, float luck,
                   int attackLength, float chanceOfDodging){
        super(name, family, healthPoint,damage, armor, speed, luck);
        this.attackLength = attackLength;
        this.chanceOfDodging = chanceOfDodging;
    }

    @Override
    public String toString() {
        return "Fighter{" +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                "attackLength=" + attackLength +
                ", chanceOfDodging=" + chanceOfDodging +
                ", healthPoint=" + healthPoint +
                ", damage=" + Arrays.toString(damage) +
                ", armor=" + armor +
                ", speed=" + speed +
                ", luck=" + luck +
                '}';
    }

    public int getAttackLength() {
        return attackLength;
    }

    public float getChanceOfDodging() {
        return chanceOfDodging;
    }
}
