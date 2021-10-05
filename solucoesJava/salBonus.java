package solucoesJava;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class salBonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double valor = sc.nextDouble();

        double total = ((valor * 15) / 100) + salario;

        System.out.printf("TOTAL = R$ %.2f", total);
        System.out.println("");
        sc.close();
    }
}