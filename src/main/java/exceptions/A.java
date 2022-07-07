package exceptions;

import java.time.LocalDate;

public class A {
    public static void main(String[] args) {
        int[] t = {3, 31, 1, -28, 5};
        int w = t[1]+t[3]; // 31-28
        System.out.print(t[w]);
        System.out.println(t[t[2] + 3]);


    }
}
