package Unit;

public class Crossbowman extends Shooter {
    Crossbowman(String name){
        super(name, "Crossbowman", 30, new int[]{10,15}, 10, 20, 0.7f, 50,
                30, 30,0.8f);
    }

//    @Override
//    public String toString() {
//        return "Crossbowman{" +
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
    return "Crossbowman{" +
            ", name='" + name + '\'' +
            ", family='" + family + '\'';
}


}
