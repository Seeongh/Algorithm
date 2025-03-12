package codingtest.prepare.test;

import java.sql.SQLOutput;

public class KMCodingTest2 {
    public static void main(String[] args) {
        int N = 102220;
        int enable_print = N % 10;
        System.out.println(N);
        while (N > 0) {
            if (enable_print == 0 && N % 10 != 0) {
                enable_print = 1;
                System.out.print(N % 10);
            }
            else if (enable_print > 0) {
                System.out.print(N % 10);
            }

            N = N / 10;
        }

    }

}
