package Unit;

public class Peasant extends Fighter{
    public Peasant(String name){
        super(name, "Peasant", 10, new int[]{5,10}, 5, 5, 0.6f,1, 0.3f);
    }

//    @Override
//    public String toString() {
//        return "Peasant{" +
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
    return "Peasant{" +
            ", name='" + name + '\'' +
            ", family='" + family + '\''+'}';
}
}
