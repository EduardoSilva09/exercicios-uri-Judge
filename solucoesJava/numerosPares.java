package solucoesJava;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class numerosPares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 7;
        double v[] = new double[n];
        int i;
        int count = 0;

        for (i = 0; i < n - 1; i++) {
            v[i] = scan.nextDouble();
            if (v[i] > 0) {
                count++;
            }
            scan.close();
        }
        System.out.println(count + " valores positivos");

    }
}
