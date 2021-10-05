package solucoesJava;

import java.util.Scanner;

public class TempoJogoMinuto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int minInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minFinal = sc.nextInt();

        int tempH = 24 - (24 + horaInicial - horaFinal) % 24;
        int tempM = 60 - (60 + minInicial - minFinal) % 60;

        if (horaInicial == horaFinal && minInicial == minFinal) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            System.out.println("O JOGO DUROU " + tempH + " HORA(S) E " + tempM + " MINUTO(S)");
        }
        sc.close();
    }
}
