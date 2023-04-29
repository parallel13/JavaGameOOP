package Unit;

public class Magician extends Magic{
    public Magician(String name){
        super(name, "Magician", 30, new int[]{40,50}, 5, 5, 0.9f, 30,20);
    }

//    @Override
//    public String toString() {
//        return "Magician{" +
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
@Override
public String toString() {
    return "Magician{" +
            ", name='" + name + '\'' +
            ", family='" + family + '\''+'}';
    }
}
