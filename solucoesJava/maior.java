package solucoesJava;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class maior {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ab = (a + b + Math.abs(a - b)) / 2;
        int maior = (ab + c + Math.abs(ab - c)) / 2;

        System.out.println(maior + " eh o maior");
        sc.close();
    }
}
