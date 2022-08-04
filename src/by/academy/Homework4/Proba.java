package by.academy.Homework4;

import java.nio.charset.Charset;
import java.util.Random;

public class Proba {
    public static void main(String[] args) {
        String s1 = "Cat2";
        String s2 = "Cat2";
        String s3 = new String(s2);
        String s4 = s3.intern();

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();


    }
}
