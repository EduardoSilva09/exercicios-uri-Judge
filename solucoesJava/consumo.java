package solucoesJava;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class consumo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt(); // distancia percorrida
        double Y = sc.nextDouble(); // combustivel gasto

        double v = X / Y;
        System.out.printf("%.3f km/l\n", v);
        sc.close();
    }
}
