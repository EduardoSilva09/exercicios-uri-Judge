package uri;

import java.util.Scanner;

public class SortSimple2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int aux = 0;

        int[] entrada = new int[3];
        entrada[0] = A;
        entrada[1] = B;
        entrada[2] = C;

        mudarPosicao(entrada, aux);

        for (int ent : entrada) {
            System.out.println(ent);
        }

        System.out.println();
        System.out.println(A + "\n" + B + "\n" + C);
        sc.close();
    }

    public static void mudarPosicao(int[] entrada, int aux) {
        for (int i = 0; i < entrada.length - 1; i++) {
            if (entrada[i] > entrada[i + 1]) {
                aux = entrada[i + 1];
                entrada[i + 1] = entrada[i];
                entrada[i] = aux;
            }
        }
        for (int j = 0; j < entrada.length - 1; j++) {
            if (entrada[j] > entrada[j + 1]) {
                mudarPosicao(entrada, aux);
            }
        }
    }
}
