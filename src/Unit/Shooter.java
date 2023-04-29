package Unit;

import java.util.Arrays;

public class Shooter extends BaseUnit{
    int distanceShoot;
    int maxCountBullet, currentCountBullet;
    protected float accuracy;


    Shooter(String name, String family, int healthPoint, int[] damage, int armor, int speed, float luck, int distanceShoot,
            int maxCountBulletm, int currentCountBullet, float accuracy){
        super(name, family,healthPoint,damage,armor,speed, luck);
        this.distanceShoot = distanceShoot;
        this.maxCountBullet = maxCountBullet;
        this.currentCountBullet = currentCountBullet;
        this.accuracy = accuracy;

    }

    @Override
    public String toString() {
        return "Shooter{" +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                "distanceShoot=" + distanceShoot +
                ", maxCountBullet=" + maxCountBullet +
                ", currentCountBullet=" + currentCountBullet +
                ", accuracy=" + accuracy +
                ", healthPoint=" + healthPoint +
                ", damage=" + Arrays.toString(damage) +
                ", armor=" + armor +
                ", speed=" + speed +
                ", luck=" + luck +
                '}';
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
}
