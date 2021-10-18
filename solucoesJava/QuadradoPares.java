package solucoesJava;

import java.util.Scanner;

/**
 *
 * @author Familia
 */
public class QuadradoPares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "^2 = " + Math.round(Math.pow(i, 2)));
            }
        }
        sc.close();
    }

}
