// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        task1();
        task2();
        task3();
    }

        public static void task1(){

            System.out.println("Задача 1");

            int age = 30;
            if (age >= 18) {
                System.out.println("Если возраст человека " +age+ " лет, он совершеннолетний.");
            }
            int age2 = 16;
            if (age2 <= 18) {
                System.out.println("Если возраст человека " +age2+ ", он не достиг совершенолетия.");
            }

        }

    public static void task2(){

        System.out.println("Задача 2");

        int temperature  = 3;
        if (temperature < 5) {
            System.out.println("На улице " +temperature+ " градуса, нужно надеть шапку.");
        }
        if (temperature >= 5) {
            System.out.println("На улице градусов " +temperature+ " можно идти без шапки.");
        }

    }

    public static void task3(){
        System.out.println("Задача 3");

        int speed = 55;
        if (speed >= 60) {
            System.out.println("Если скорость " +speed+ " то придетзя заплатить штрафю.");
        } else  {
            System.out.println("Если скорость " +speed+ " ездить можно спокойно.");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");

        int dog = 6;


    }


    }
