package solucoesJava;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class media3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double N1 = sc.nextDouble();// uma casa decimal cada peso 2, 3,4,1
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();
        double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
        // Saida
        if (media >= 7.0) {
            System.out.printf("Media: %.1f \n", media);
            System.out.println("Aluno aprovado.");
        }
        if (media < 5.0) {
            System.out.printf("Media: %.1f \n", media);
            System.out.println("Aluno reprovado.");
        }
        if ((media >= 5.0) || (media < 7.0)) {
            double nEx = sc.nextDouble();
            System.out.printf("Media: %.1f \n", media);
            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: %.1f \n", nEx);
            media = (media + nEx) / 2;
            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
            }
            if (media < 5.0) {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", media);
        }
        sc.close();
    }
}
