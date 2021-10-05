package solucoesJava;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class CoordenadasPonto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if ((x == y) && (y == 0.0)) {
            System.out.println("Origem");
        }
        if ((x > 0.0) && (y > 0.0)) {
            System.out.println("Q1");
        }
        if ((x < 0.0) && (y > 0.0)) {
            System.out.println("Q2");
        }
        if ((x < 0.0) && (y < 0.0)) {
            System.out.println("Q3");
        }
        if ((x > 0.0) && (y < 0.0)) {
            System.out.println("Q4");
        }
        if ((x == 0.0) && (y != 0.0)) {
            System.out.println("Eixo Y");
        }
        if ((y == 0.0) && (x != 0.0)) {
            System.out.println("Eixo X");
        }
        sc.close();
    }
}
