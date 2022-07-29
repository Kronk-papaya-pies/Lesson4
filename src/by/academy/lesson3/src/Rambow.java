public class Rambow {
    public static void main(int n) {
        if (n >= 1 && n <= 7) {
            proc(n);
        }
        if (n >= 12 && n <= 21 || n >= 23 && n <= 32 || n >= 34 && n <= 43 || n >= 45 && n <= 54 || n >= 56 && n <= 65 || n >= 67 && n <= 76) {
            del(n);
            proc(n);
        }
        if (n == 11 || n == 22 || n == 33 || n == 44 || n == 55 || n == 66 || n == 77) {
            System.out.println("Серьезно? Нельзя выбрать одинаковые цвета в полуцветах.");
        }
        if (n<=0 || n>=8 && n<=10 || n>=18 && n<=20 || n>=28 && n<=30 || n>=38 && n<=40 || n>=48 && n<=50 || n>=58 && n<=60 || n>=68 && n<=70 || n>=78) {
            System.out.println("Такого цвета нет в программе. Пожалуйста, выберите другое число.");
        }
    }

    public static void del(int n) {
        final String R = "Красно-";
        final String O = "Оранжево-";
        final String Y = "Жёлто-";
        final String G = "Зелёно-";
        final String S = "Голубо-";
        final String B = "Сине-";
        final String P = "Фиолетово-";

        switch (n / 10) {
            case 1:
                System.out.print(R);
                break;
            case 2:
                System.out.print(O);
                break;
            case 3:
                System.out.print(Y);
                break;
            case 4:
                System.out.print(G);
                break;
            case 5:
                System.out.print(S);
                break;
            case 6:
                System.out.print(B);
                break;
            case 7:
                System.out.print(P);
                break;
        }
    }

    public static void proc(int n) {
        final String r = "красный";
        final String o = "оранжевый";
        final String y = "жёлтый";
        final String g = "зелёный";
        final String s = "голубой";
        final String b = "синий";
        final String p = "фиолетовый";

        switch (n % 10) {
            case 1:
                System.out.println(r);
                break;
            case 2:
                System.out.println(o);
                break;
            case 3:
                System.out.println(y);
                break;
            case 4:
                System.out.println(g);
                break;
            case 5:
                System.out.println(s);
                break;
            case 6:
                System.out.println(b);
                break;
            case 7:
                System.out.println(p);
                break;
        }
    }
}