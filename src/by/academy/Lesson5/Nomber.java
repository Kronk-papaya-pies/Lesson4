package by.academy.Lesson5;

public class Nomber {
    public static void main(String[] args) {
        String s = "Heooollo";
        int l = s.length();
        char k = s.charAt(l - 1);
        int m;
        for (int i = 0; i < l - 1; i++) {
            if (s.charAt(i) == k) {
                m = i+1;
                System.out.println("Номер " + m + " подходит под условие");
            }
        }
    }
}
