package solucoesJava;

import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double area;

        if ((A + B) <= C || (B + C) <= A || (A + C) <= B) { // NEGATIVO
            area = ((A + B) * C) / 2;
            System.out.println("Area = " + area);
        } else {// POSITIVO
            System.out.println("Perimetro = " + (A + B + C));
        }
        sc.close();
    }
}
