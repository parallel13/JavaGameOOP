package Unit;

import java.util.ArrayList;

public abstract class ShooterUnits extends BaseUnit {
    int distanceShoot;
    int maxCountBullet, currentCountBullet;
    protected float accuracy;


    ShooterUnits(String name, String family, float healthPoint, float maxHealthPoint, int attack, int armor, int speed, float luck,
                 ArrayList<BaseUnit> team, int distanceShoot, int maxCountBullet, int currentCountBullet,
                 float accuracy) {
        super(name, family, healthPoint, maxHealthPoint, attack, armor, speed, luck, team);
        this.distanceShoot = distanceShoot;
        this.maxCountBullet = maxCountBullet;
        this.currentCountBullet = currentCountBullet;
        this.accuracy = accuracy;

    }


    @Override
    public String getInfo() {
        return super.getInfo() + ", distanceShoot=" + distanceShoot + ", maxCountBullet=" + maxCountBullet +
                ", currentCountBullet=" + currentCountBullet + ", accuracy=" + accuracy + "}";
    }

    public int getDistanceShoot() {
        return distanceShoot;
    }

    public int getMaxCountBullet() {
        return maxCountBullet;
    }

    public int getCurrentCountBullet() {
        return currentCountBullet;
    }

    public float getAccuracy() {
        return accuracy;
    }


    @Override
    public void step(ArrayList<BaseUnit> enemy) {
        if (die() || currentCountBullet <= 0) {
            return;
        }
        attack(findNearUnit(enemy));
        for (BaseUnit unit : team) {
            if (unit instanceof Peasant) {
                if (!unit.die() && ((Peasant) unit).readiness) {
                    ((Peasant) unit).readiness = false;
                    return;
                }
            }
        }
        this.currentCountBullet--;
    }
}
