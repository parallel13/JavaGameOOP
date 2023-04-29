package Unit;

public class Robber extends Fighter{
    public Robber(String name){
        super(name, "Robber", 30, new int[]{10,20}, 15, 15, 0.7f,1,
                0.7f);
    }

//    @Override
//    public String toString() {
//        return "Robber{" +
//                ", name='" + name + '\'' +
//                ", family='" + family + '\'' +
//                "attackLength=" + attackLength +
//                ", chanceOfDodging=" + chanceOfDodging +
//                ", healthPoint=" + healthPoint +
//                ", damage=" + Arrays.toString(damage) +
//                ", armor=" + armor +
//                ", speed=" + speed +
//                ", luck=" + luck +
//                '}';
//    }
@Override
public String toString() {
    return "Robber{" +
            ", name='" + name + '\'' +
            ", family='" + family + '\''+'}';
}
}
