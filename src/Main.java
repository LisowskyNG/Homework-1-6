// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }

    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        for (int i = 10; i >= -10; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }


    public static void task5() {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
                System.out.println(i);
        }
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.printf(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
        for (int i = 2; i <= 512; i = i * 2) {
            System.out.printf(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");
        // Пишем код для задачи 8
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum = sum + 29000;
            System.out.println("Месяц " + i + " Сумма накоплений равна " + sum + "руб.");
        }
        System.out.println();
    }

    public static void task9() {
        System.out.println("Задача 9");
        // Пишем код для задачи 8
        float sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum = (float) (sum * 0.01 + sum + 29000);
            System.out.println("Месяц " + i + " Сумма накоплений равна " + sum + "руб.");
        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        // Пишем код для задачи 10
        for (int i = 1; i <= 10; i++) {
            int result = 2 * i;
            System.out.println("2 * " + i + " = " + result);
        }
        System.out.println();
    }
}