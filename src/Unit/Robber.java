package Unit;

import java.util.ArrayList;

public class Robber extends FighterUnits {
    public Robber(String name, ArrayList<BaseUnit> team){
        super(name, "Robber", 30,30, 10, 15, 15, 0.7f,team,1,
                0.7f);
    }


}
