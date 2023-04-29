import Unit.*;

public class Main {
    public static void main(String[] args) {
//        Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
//        Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
//        Создать абстрактный класс и иерархию наследников. Расположить классы в пакет так, чтобы в основной программе
//        небыло видно их полей. В не абстрактных классах переопределить метод toString() так чтобы он возвращал
//        название класса или имя. Создать в основной программе по одному обьекту каждого не абстрактного класса
//        и вывести в консоль его имя.
        Magician magician1 = new Magician("Alex");
        System.out.println(magician1);

        Monk monk1 = new Monk("Ivan");
        System.out.println(monk1);

        Peasant peasant1 = new Peasant("Kol");
        System.out.println(peasant1);

        Robber robber1 = new Robber("Den");
        System.out.println(robber1);

        Sniper sniper1 = new Sniper("Igor");
        System.out.println("Sniper{" + "name='" + sniper1.getName() + '\'' + " family='" + sniper1.getFamily() + '\'' + "}");

        Spearman spearman1 = new Spearman("Vit");
        System.out.println("Spearman{" + "name='" + spearman1.getName() + '\'' + " family='" + spearman1.getFamily() + '\'' + "}");


    }
}