package Unit;

import java.util.ArrayList;

public class Monk extends MagicUnits {
    public Monk(String name, ArrayList<BaseUnit> team) {
        super(name, "Monk", 30,30, 20, 5, 5, 0.9f, team,20, 20, 20);
    }

}
