/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri2;

import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class Intervalo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        if (valor > 0 && valor < 25.01) {
            System.out.println("Intervalo [0,25]");
        } else if (valor <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (valor <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (valor <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
        sc.close();
    }
}
