package Unit;

import java.util.ArrayList;

public class Sniper extends ShooterUnits {
public Sniper(String name, ArrayList<BaseUnit> team){
    super(name, "Sniper", 30,30, 10, 10, 20, 0.8f,team, 50,
            30, 30,0.9f);
    }



}
