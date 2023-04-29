package Unit;

import java.util.Arrays;

public abstract class Magic extends BaseUnit {
    protected float mana;
    protected int distanseCastom;


    Magic(String name, String family, int healthPoint, int[] damage, int armor, int speed, float luck, float mana,
          int distanseCastom) {
        super(name, family, healthPoint, damage, armor, speed, luck);
        this.mana = mana;
        this.distanseCastom = distanseCastom;
    }


    @Override
    public String getInfo() {
        return super.getInfo() + ", mana=" + mana + ", distanseCastom=" + distanseCastom+"}";
    }

    public float getMana() {
        return mana;
    }

    public int getDistanseCastom() {
        return distanseCastom;
    }
}
