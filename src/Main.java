import Unit.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Comparator;

import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
//        Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
//        Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
//        Создать абстрактный класс и иерархию наследников. Расположить классы в пакет так, чтобы в основной программе
//        небыло видно их полей. В не абстрактных классах переопределить метод toString() так чтобы он возвращал
//        название класса или имя. Создать в основной программе по одному обьекту каждого не абстрактного класса
//        и вывести в консоль его имя.
//        Magician magician1 = new Magician("Alex");
//        System.out.println(magician1.getInfo());
//

        static public ArrayList<BaseUnit> team1 = new ArrayList<>();
        static public ArrayList<BaseUnit> team2 = new ArrayList<>();
        static public ArrayList<BaseUnit> team3 = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    team1.add(new Peasant(getName(), team1));
                    break;
                case 1:
                    team1.add(new Spearman(getName(), team1));
                    break;
                case 2:
                    team1.add(new Crossbowman(getName(), team1));
                    break;
                case 3:
                    team1.add(new Magician(getName(), team1));
                    break;
            }
        }


        //ArrayList<Unit> team2 = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    team2.add(new Peasant(getName(), team2));
                    break;
                case 1:
                    team2.add(new Robber(getName(), team2));
                    break;
                case 2:
                    team2.add(new Sniper(getName(), team2));
                    break;
                case 3:
                    team2.add(new Monk(getName(), team2));
                    break;
            }
        }

        //ArrayList<Unit> team3 = new ArrayList<Unit>();
        team3.addAll(team1);
        team3.addAll(team2);
        team3.sort(new Comparator<BaseUnit>() {

            @Override
            public int compare(BaseUnit o1, BaseUnit o2) {
                return o2.getSpeed() - o1.getSpeed();
            }

        });
        System.out.println(Charset.defaultCharset());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            View.view();
            scanner.nextLine();
            for (Unit unit : team3) {
                if (team1.contains(unit)) {
                    unit.step(team2);
                }else{
                    unit.step(team1);
                }
            }
        }

    }
    private static String getName(){
        return String.valueOf(UnitName.values()[new Random().nextInt(UnitName.values().length)]);
    }
}