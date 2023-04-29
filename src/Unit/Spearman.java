package Unit;

import java.util.Arrays;

public class Spearman extends Fighter{
    public Spearman(String name){
        super(name, "Spearman", 10, new int[]{15,25}, 20, 10, 0.8f,2, 0.6f);
    }

    @Override
    public String toString() {
        return "Spearman{" +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                "attackLength=" + attackLength +
                ", chanceOfDodging=" + chanceOfDodging +
                ", healthPoint=" + healthPoint +
                ", damage=" + Arrays.toString(damage) +
                ", armor=" + armor +
                ", speed=" + speed +
                ", luck=" + luck +
                '}';
    }
}
