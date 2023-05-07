package Unit;

import java.util.ArrayList;

public class Peasant extends FighterUnits {
    public Peasant(String name, ArrayList<BaseUnit> team){
        super(name, "Peasant", 10,10 ,5, 5, 5, 0.6f,team,1, 0.3f);
    }



}
