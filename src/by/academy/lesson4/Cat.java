package by.academy.lesson4;

import java.util.Random;

public class Cat {

    public static void main() {
        String cat1Name = "ФеняЗаряСараШансДымаМураЛапаНикаМорсГоша";
        System.out.println("Первый цикл:");
        int n = 1;
        while (n != 10) {
            Random random = new Random();
            int age = random.nextInt(1, 28);
            String name = cat1Name.substring(4 * n, 4 * n + 4);
            System.out.println("Имя кота - " + name);
            System.out.println("Возраст кота - " + age + " лет");
            n++;
        }
        System.out.println(" ");
        System.out.println("Второй цикл:");
        System.out.println("(Простите, с геттерами и сеттерами так ничего и не вышло)");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Имя кота - " + i);
            System.out.println("Возраст кота - " + i + " лет");
        }
        System.out.println(" ");
        System.out.println("Третий цикл:");
        int m = 1;
        do {
            String cat3Name = "ФеняЗаряСараШансДымаМураЛапаНикаМорсГоша";
            System.out.println(cat3Name.substring(4 * m, 4 * m + 4));
            m++;
        } while (m <= 9);
    }
}