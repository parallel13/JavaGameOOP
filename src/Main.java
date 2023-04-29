import Unit.*;

import java.util.ArrayList;
import java.util.Random;

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
//        Monk monk1 = new Monk("Ivan");
//        System.out.println(monk1.getInfo());
//
//        Peasant peasant1 = new Peasant("Kol");
//        System.out.println(peasant1.getInfo());
//
//        Robber robber1 = new Robber("Den");
//        System.out.println(robber1.getInfo());
//
//        Sniper sniper1 = new Sniper("Igor");
//        System.out.println(sniper1.getInfo());
//
//        Crossbowman crossbowman1 = new Crossbowman("Oleg");
//        System.out.println(crossbowman1.getInfo());
//
//        Spearman spearman1 = new Spearman("Vit");
//        System.out.println(spearman1.getInfo());

        ArrayList<BaseUnit> team1= new ArrayList();
        ArrayList<BaseUnit> team2= new ArrayList();

        team1.add(new Crossbowman(getName()));
        team1.add(new Magician(getName()));
        team1.add(new Peasant(getName()));
        team1.add(new Robber(getName()));

        team2.add(new Sniper(getName()));
        team2.add(new Monk(getName()));
        team2.add(new Peasant(getName()));
        team2.add(new Spearman(getName()));

        System.out.println("[Команда 1]");
        team1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("\n[Команда 2]");
        team2.forEach(n -> System.out.println(n.getInfo()));

//        for (int i = 0; i < 10; i++) {
//            switch (new Random().nextInt(4)){
//                case 0:
//                    team1.add(new Peasant(getName());
//                case 1:
//            }
//        }

            }
    private static String getName(){
        return String.valueOf(UnitName.values()[new Random().nextInt(UnitName.values().length)]);
    }
}