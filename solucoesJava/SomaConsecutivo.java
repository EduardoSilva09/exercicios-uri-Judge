package solucoesJava;

import java.util.Scanner;

/**
 *
 * @author Familia
 */
public class SomaConsecutivo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int somaY = 0;

        if (X < Y) {
            int aux = X;
            X = Y;
            Y = aux;
        }
        for (int i = Y; i < X; i++) {
            if (Y % 2 == 1) {
                somaY = (somaY) + (Y);
            }
            Y++;
        }
        System.out.println("Y = " + Y);
        System.out.println("soma Y = " + somaY);
        sc.close();
    }
}
