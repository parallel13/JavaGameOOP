package Unit;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class BaseUnit implements GameInterface {
    protected String name;
    protected String family;
    protected float healthPoint;
    protected float maxHealthPoint;
    protected int attack;
    protected int armor;
    protected int speed;
    protected float luck;
    protected ArrayList<BaseUnit> team, enemy;

//    protected int initiative;
//    protected Coordinate coordinate;
//int x, int y


    public BaseUnit(String name, String family, float healthPoint, float maxHealthPoint, int attack, int armor, int speed, float luck,
                    ArrayList<BaseUnit> team) {
        this.name = name;
        this.family = family;
        this.healthPoint = healthPoint;
        this.maxHealthPoint = maxHealthPoint;
        this.attack = attack;
        this.armor = armor;
        this.speed = speed;
        this.luck = luck;
        this.team = team;
//        this.attack = attack;
//        this.coordinate = new Coordinate(x, y);
    }


    boolean die(){
        if (healthPoint <= 0) {
            return true;
        }else{
            return false;
        }
    }
    public void getDmage(float damage){
        this.healthPoint -= damage;
        if (this.healthPoint > this.maxHealthPoint) {
            this.healthPoint = this.maxHealthPoint;
        }
        if (this.healthPoint < 0) {
            this.healthPoint = 0;
        }
        void attack(BaseUnit target){
            target.getDmage(attack);
            //System.out.println(this.introduce() + " атакует " + target.introduce());
        }
    }
//    public int[] getCoords() {
//        return new int[]{this.coordinate.y, coordinate.x};
//    }
//    public BaseUnit findNearUnit(ArrayList<BaseUnit> team){
//        BaseUnit nearUnit = null;
//        float minDist = Float.MAX_VALUE;
//        for (BaseUnit unit : team) {
//            float dist = unit.coordinate.distance(this.coordinate);
//            if (minDist > dist) {
//                nearUnit = unit;
//                minDist = dist;
//            }
//        }
//        return nearUnit;
//    }


    public void step(ArrayList<BaseUnit> enemy) {

    }
    
    
    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public float getHp() {
        return healthPoint;
    }

    public int getArmor() {
        return armor;
    }

    public int getSpeed() {
        return speed;
    }

    public float getLuck() {
        return luck;
    }
//    public int[] getCoords() {
//        return new int[]{this.coordinate.y, coordinate.x};
//    }

    @Override
    public String getInfo() {
        return  "{, name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", healthPoint=" + healthPoint +
                ", damage=" + attack +
                ", armor=" + armor +
                ", speed=" + speed +
                ", luck=" + luck;
    }

}
