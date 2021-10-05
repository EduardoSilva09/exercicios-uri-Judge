package solucoesJava;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Familia
 */
public class AumentoSalario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        int percentual = 0;

        if (salario >= 0 && salario <= 400.00) {// 15% reajuste
            percentual = 15;
            exibir(salario, percentual);
        } else if (salario > 400.00 && salario <= 800.00) {// 12% reajuste
            percentual = 12;
            exibir(salario, percentual);
        } else if (salario > 800.00 && salario <= 1200.00) {// 10% reajuste
            percentual = 10;
            exibir(salario, percentual);
        } else if (salario > 1200.00 && salario <= 2000.00) {// 7% reajuste
            percentual = 7;
            exibir(salario, percentual);
        } else if (salario > 2000.00) {// 4% reajuste
            percentual = 4;
            exibir(salario, percentual);
        }
    }

    private static void exibir(double salario, int percentual) {
        double reajuste = salario * percentual / 100;
        DecimalFormat df = new DecimalFormat("0.00");

        String s = "Novo salario: " + df.format(salario + reajuste);
        s += "\nReajuste ganho: " + df.format(reajuste);
        s += "\nEm percentual: " + percentual + " %";
        System.out.println(s);
    }

}
