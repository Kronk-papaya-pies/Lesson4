package by.academy.lesson1;

public class One {

    public static int a = 10;
    public static int b = 2;

    public static int getA() {
        a = One.a;
        System.out.println("значение get a =" + a);
        return a;
    }

    public static int getB() {
        b = One.b;
        System.out.println("значение get b =" + b);
        return b;
    }

    public static void setA(int a) {
        One.a = a;
        a = a * 2;
        a = a - 12;
        System.out.println("значение set а = " + a);
    }

    public static void setB(int b) {
        One.b = b;
        b = b ^ 3;
        b = b + 81;
        System.out.println("значение set b =" + b);
    }

    public static void main (String[] args) {
        int max = Integer.max(a, b); //a = 5;
        b = b + 6;
        a = a * b;
        print();
        getA();
        getB();
        setA(a);
        setB(b);
        Two two = new Two();
        two.print();
    }

    public static void print () {
        System.out.println("значение а =" + a);
        System.out.println("значение b =" + b);


    }

}