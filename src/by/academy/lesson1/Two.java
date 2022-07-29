package by.academy.lesson1;

public class Two {
    char x = 'I';
    char y = 'T';

    private void p1 () {
        int c = 9;
        if (c > One.b) c = One.b;
        System.out.println("значение локального значения = " + c);
    }

    public void print () {
        p1();
        System.out.println("Мне нравится " + x + y + ".");
    }
}
