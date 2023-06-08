import javax.sound.midi.Soundbank;
import javax.xml.transform.SourceLocator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {

        System.out.println("Задача 1");

        int age = 30;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age + " лет, он совершеннолетний.");
        }
        if (age <= 18) {
            System.out.println("Если возраст человека " + age + ", он не достиг совершенолетия.");
        }

    }

    public static void task2() {

        System.out.println("Задача 2");

        int temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку.");
        }
        if (temperature >= 5) {
            System.out.println("На улице градусов " + temperature + " можно идти без шапки.");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");

        int speed = 55;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " то придетзя заплатить штрафю.");
        } else {
            System.out.println("Если скорость " + speed + " ездить можно спокойно.");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");

        int human = 30;
        if (human >= 2 && human <= 6) {
            System.out.println("Если возраст человека равен " + human + " ,то ему пора спать.");
        } else if (human > 2 && human <= 6) {
            System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить в детский сад.");
        } else if (human > 7 && human <= 18) {
            System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить в школу.");
        } else if (human > 18 && human <= 24) {
            System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить в университет.");
        } else if (human > 24) {
            System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить на работу.");
        } else if (human > 60) {
            System.out.println("Если возраст человека равен " + human + ", то ему можно отдыхать.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");

        int kid = 10;
        if (kid < 5) {
            System.out.println("Если возраст ребенка равен " + kid + " года то ему" +
                    " нельзя кататься на атракционах.");
        } else if (kid >= 5 && kid < 14) {
            System.out.println("Если возраст ребенка равен " + kid + " года то ему можно " +
                    "кататься на атракционах в сопровождениии.");
        } else if (kid >= 14) {
            System.out.println("Если возраст ребенка равен " + kid + " года то ему можно " +
                    "кататься на атракционах без сопровождения взрослых.");
        }

    }

    public static void task6() {
        System.out.println("Задание 6");

        int van = 102;
        int sittingPlaces = 60;
        int standingPlaces = van - sittingPlaces;

        int searsUsed = 26;
        int otherUsed = 33;
        if (searsUsed < sittingPlaces) {
            System.out.println("Есть ещё " + (sittingPlaces - searsUsed) + " сидячих мест.");
        }
        if (searsUsed == sittingPlaces) {
            System.out.println("Сидячих мест нет.");
        }
        if (otherUsed < standingPlaces) {
            System.out.println("Есть еще " + (standingPlaces - otherUsed) + " стоячих мест.");
        }
        if (otherUsed == standingPlaces) {
            System.out.println("Стоячих мест нет.");
        }
    }

    public static void task7() {
        System.out.println("Задание 7");
    int one = 55;
    int two = 70;
    int three = 36;
    if (one >=two&&one>three) {
        System.out.println(one + " большее число");
    } else if (two>one&&two>three) {
        System.out.println(two + " большее число");
    }
        else if (one == two&&two == three) {
            System.out.println("все числа равные "+one);
        }
        else {
            System.out.println(three + " большее число");
        }
    }
        }



