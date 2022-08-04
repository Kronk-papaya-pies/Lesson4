package by.academy.Homework4;

import java.util.Random;

public class Matr {
    public static void main(String[] args) {

        String[][] arrays = new String[10][10];
        float[][] arrayf = new float[10][10];
        int k = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // a=matr[j,i]
                int leftLimit = 97; // letter 'a'
                int rightLimit = 122; // letter 'z'
                int targetStringLength = 10;
                Random random = new Random();

                String gStr = random.ints(leftLimit, rightLimit + 1)
                        .limit(targetStringLength)
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                        .toString();

                if (k % 3 == 0) {
                    arrayf[i][j] = Math.abs(random.nextFloat(9));
                    System.out.print(Math.abs(random.nextFloat(9)) + " ");
                } else {
                    arrays[i][j] = gStr;
                    System.out.print(gStr + " ");
                }
                k++;
            }
            System.out.println();
        }
        float[] f = new float[10];
        String[] s = new String[10];
        int p = 1;
        int l = 1;
        for (int i = 0; i < 10; i++) {
            if (i == 1 || i == 4 || i == 7) {
                f[p] = arrayf[i][i];
                p++;
            } else {
                s[l] = arrays[i][i];
                l++;
            }
        }
        for (int i = 1; i < l; i++) {
            s[i] = s[i].substring(1, 4);
            System.out.println(s[i]);
        }
        for (int i = 1; i < p; i++) {
            double u = 1.7;
            if (f[i] > u) {
                int w = (int) f[i]/1+1;
                System.out.println("Не вышло");
            }
            else {
                int vv = (int) f[i]/1;
                System.out.println("Провал");
            }
        }
    }
}
