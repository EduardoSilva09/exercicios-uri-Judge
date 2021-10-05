package solucoesJava;

import java.util.Scanner;

public class TiposTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double[] input = new double[3];
        double aux = 0;

        input[0] = A;
        input[1] = B;
        input[2] = C;

        decrescente(input, aux);

        A = input[0];
        B = input[1];
        C = input[2];

        tipoTriangulo(A, B, C);

        sc.close();
    }

    private static void decrescente(double[] input, double aux) {
        for (int i = input.length - 1; i > 0; i--) {
            if (input[i] > input[i - 1]) {
                aux = input[i - 1];
                input[i - 1] = input[i];
                input[i] = aux;
            }
        }
        for (int i = input.length - 1; i > 0; i--) {
            if (input[i] > input[i - 1]) {
                decrescente(input, aux);
            }
        }
    }

    private static void tipoTriangulo(double A, double B, double C) {
        if (A >= (B + C)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if (Math.pow(A, 2) == (Math.pow(B, 2) + Math.pow(C, 2))) {
            System.out.println("TRIANGULO RETANGULO");
        } else if (Math.pow(A, 2) > (Math.pow(B, 2) + Math.pow(C, 2))) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if (Math.pow(A, 2) < (Math.pow(B, 2) + Math.pow(C, 2))) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (A == B && B == C) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (A == B || B == C || A == C) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
