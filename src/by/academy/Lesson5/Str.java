package by.academy.Lesson5;

public class Str {

    public static void main(String[] args) {
        String s = "Hello";
        int l = s.length();
        System.out.println("Первый символ - " + s.charAt(0));
        if (l%2==1) {
            int k = l%2;
            k = k*2;
            System.out.println("Средний символ - " + s.charAt(k));
        }
        else {
            System.out.println("Среднего символа нет");
        }
        System.out.println("Первый символ - " + s.charAt(l-1));
    }
}
