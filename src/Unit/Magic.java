package Unit;

import java.util.Arrays;

public class Magic extends BaseUnit {
    protected float mana;
    protected int distanseCastom;


    Magic(String name, String family, int healthPoint, int[] damage, int armor, int speed, float luck, float mana,
          int distanseCastom){
        super(name, family, healthPoint, damage, armor, speed, luck);
        this.mana = mana;
        this.distanseCastom = distanseCastom;
    }

    @Override
    public String toString() {
        return "Magic{" +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                "mana=" + mana +
                ", distanseCastom=" + distanseCastom +
                ", healthPoint=" + healthPoint +
                ", damage=" + Arrays.toString(damage) +
                ", armor=" + armor +
                ", speed=" + speed +
                ", luck=" + luck +
                '}';
    }

    public float getMana() {
        return mana;
    }

    public int getDistanseCastom() {
        return distanseCastom;
    }
}
