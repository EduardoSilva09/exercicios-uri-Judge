package solucoesJava;

import java.util.Scanner;

/**
 *
 * @author Familia
 */
public class impostoRenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double renda = sc.nextDouble();
        calcularImosto(renda);
        sc.close();

    }

    public static double calcularImosto(double renda) {
        double percentual = 0;
        if (renda >= 0.00 && renda <= 2000.00) {
            System.out.println("Isento");
        } else if (renda > 2000.00 && renda <= 3000.00) {
            percentual = 0.08;

        } else if (renda > 3000.00 && renda <= 4500.00) {
            percentual = 0.18;

        } else if (renda > 4500.00) {
            percentual = 0.28;
        }
        return renda * percentual;
    }
}
