package uri;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class media {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //DecimalFormat df = new DecimalFormat("0.0");

        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();

        double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
       // System.out.println("Media: "+ df.format(media));
        verificarSituacao(media);
       // exame(media, sc, df);
        sc.close();
    }

    private static void verificarSituacao(double media) {
        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        }
    }

   /* private static void exame(double media, Scanner sc, DecimalFormat df) {
        double mFinal;
        double exame;

        if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            exame = sc.nextDouble();
            mFinal = (media + exame) / 2;

            System.out.println("Nota do exame: "+ df.format(exame));
            media = exame;

            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else if (media < 5.0) {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: "+ df.format(mFinal));
        }
    }*/
}
