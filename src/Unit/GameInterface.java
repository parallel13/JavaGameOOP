package Unit;

import java.util.ArrayList;

public interface GameInterface {
    void step(ArrayList<BaseUnit> enemy);
    String getInfo();

}
