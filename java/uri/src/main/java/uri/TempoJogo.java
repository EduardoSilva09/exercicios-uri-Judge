package uri;

import java.util.Scanner;

public class TempoJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initialHour = sc.nextInt();
        int finalHour = sc.nextInt();
        int temp;

        if (initialHour == finalHour) {
            
            System.out.println("O JOGO DUROU 24 HORA(S)");

        } else if (initialHour > finalHour) {

            temp = 24 - initialHour;
            temp += finalHour;
            System.out.println("O JOGO DUROU " + temp + " HORA(S)");

        } else if (initialHour < finalHour) {

            temp = finalHour - initialHour;
            System.out.println("O JOGO DUROU " + temp + " HORA(S)");

        }

        sc.close();
    }
}
