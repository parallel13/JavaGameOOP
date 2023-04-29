package Unit;

import java.util.Arrays;

public class Sniper extends Shooter {
public Sniper(String name){
    super(name, "Crossbowman", 30, new int[]{10,15}, 10, 20, 0.8f, 50,
            30, 30,0.9f);
    }

//    @Override
//    public String toString() {
//        return "Sniper{" +
//                ", name='" + name + '\'' +
//                ", family='" + family + '\'' +
//                "distanceShoot=" + distanceShoot +
//                ", maxCountBullet=" + maxCountBullet +
//                ", currentCountBullet=" + currentCountBullet +
//                ", accuracy=" + accuracy +
//                ", healthPoint=" + healthPoint +
//                ", damage=" + Arrays.toString(damage) +
//                ", armor=" + armor +
//                ", speed=" + speed +
//                ", luck=" + luck +
//                '}';
//    }
@Override
public String toString() {
    return "Sniper{" +
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
}
