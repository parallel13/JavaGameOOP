package Unit;

public class Monk extends Magic{
    public Monk(String name){
        super(name, "Monk", 30,new int[]{30,40}, 5, 5, 0.9f, 30,20);
    }

//    @Override
//    public String toString() {
//        return "Monk{" +
//                ", name='" + name + '\'' +
//                ", family='" + family + '\'' +
//                "mana=" + mana +
//                ", distanseCastom=" + distanseCastom +
//                ", healthPoint=" + healthPoint +
//                ", damage=" + Arrays.toString(damage) +
//                ", armor=" + armor +
//                ", speed=" + speed +
//                ", luck=" + luck +
//                '}';
//    }
@Override
public String toString() {
    return "Monk{" +
            ", name='" + name + '\'' +
            ", family='" + family + '\''+'}';
}
}
