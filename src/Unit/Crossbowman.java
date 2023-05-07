package Unit;

import java.util.ArrayList;

public class Crossbowman extends ShooterUnits {
    public Crossbowman(String name, ArrayList<BaseUnit> team){
        super(name, "Crossbowman", 30,30, 10, 10, 20, 0.7f,team, 50,
                30, 30,0.8f);
    }

    @Override
    public void step() {

    }


}
