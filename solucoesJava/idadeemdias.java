package solucoesJava;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class idadeemdias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        System.out.println(idade / 365 + " ano(s)");
        idade = idade % 365;
        System.out.println(idade / 30 + " mes(es)");
        idade = idade % 30;
        System.out.println(idade / 1 + " dia(s)");

        sc.close();
    }
}
