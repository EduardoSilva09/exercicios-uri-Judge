package solucoesJava;

import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class notasMoedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double v = sc.nextDouble();
        int valor = 0;

        System.out.println("NOTAS:");
        valor = (int) v / 100;
        System.out.printf("%d nota(s) de R$ 100.00\n", valor);
        v = v % 100.0;

        valor = (int) v / 50;
        System.out.printf("%d nota(s) de R$ 50.00\n", valor);
        v = v % 50.0;

        valor = (int) v / 20;
        System.out.printf("%d nota(s) de R$ 20.00\n", valor);
        v = v % 20.0;

        valor = (int) v / 10;
        System.out.printf("%d nota(s) de R$ 10.00\n", valor);
        v = v % 10.0;
        valor = (int) v / 5;
        System.out.printf("%d nota(s) de R$ 5.00\n", valor);
        v = v % 5.0;

        valor = (int) v / 2;
        System.out.printf("%d nota(s) de R$ 2.00\n", valor);
        v = v % 2.0;

        System.out.println("MOEDAS:");
        v = v * 100;
        valor = (int) v / 100;
        System.out.printf("%d moeda(s) de R$ 1.00\n", valor);
        v = v % 100;

        valor = (int) v / 50;
        System.out.printf("%d moeda(s) de R$ 0.50\n", valor);
        v = v % 50.0;

        valor = (int) v / 25;
        System.out.printf("%d moeda(s) de R$ 0.25\n", valor);
        v = v % 25.0;

        valor = (int) v / 10;
        System.out.printf("%d moeda(s) de R$ 0.10\n", valor);
        v = v % 10.0;

        valor = (int) v / 5;
        System.out.printf("%d moeda(s) de R$ 0.05\n", valor);
        v = v % 5.0;

        valor = (int) v / 1;
        System.out.printf("%d moeda(s) de R$ 0.01\n", valor);
        v = v % 1.0;
        sc.close();
    }
}
