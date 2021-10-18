package solucoesJava;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class gasComb {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        int th, vkm; // tempo em horas e velocidadde em km

        th = sc.nextInt();
        vkm = sc.nextInt();

        double litro = th * vkm;
        litro /= 12;
        System.out.printf("%.3f", litro);
        System.out.println("");
        sc.close();
    }
}
