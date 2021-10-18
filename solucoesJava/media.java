package solucoesJava;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class media {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // DecimalFormat df = new DecimalFormat("0.0");

        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();

        double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
        verificarSituacao(media);
        sc.close();
    }

    private static void verificarSituacao(double media) {
        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        }
    }
}
