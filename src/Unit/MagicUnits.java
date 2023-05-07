package Unit;

import java.util.ArrayList;

public abstract class MagicUnits extends BaseUnit {
    protected float mana, maxMana;
    protected int distanseCastom;


    MagicUnits(String name, String family, float healthPoint, float maxHealthPoint, int attack, int armor, int speed, float luck,
               ArrayList<BaseUnit> team, float mana,float maxMana, int distanseCastom) {
        super(name, family, healthPoint, maxHealthPoint, attack, armor, speed, luck, team);
        this.mana = mana;
        this.maxMana = maxMana;
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

    @Override
    public void step(ArrayList<BaseUnit> enemy) {
        if (!die() && mana > 0) {
            for (BaseUnit unit : team) {
                if (BaseUnit.healthPoint < BaseUnit.maxHealthPoint) {
                    BaseUnit.getDmage(-attack);
                    this.mana--;
                    //System.out.println(this.introduce() + " лечит " + unit.introduce());
                    return;
                }
            }
        }
    }
}
