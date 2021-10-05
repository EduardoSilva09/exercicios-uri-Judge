package solucoesJava;

import java.util.Scanner;

/**
 *
 * @author Familia
 */
public class Animal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] palavras = new String[3];

        for (int i = 0; i < palavras.length; i++) {
            palavras[i] = sc.nextLine();
        }
        tipo(palavras[0], palavras[1], palavras[2]);
        sc.close();
    }

    public static void tipo(String vertebra, String classe, String alimentacao) {
        if (vertebra.equalsIgnoreCase("vertebrado")) {
            if (classe.equalsIgnoreCase("ave")) {
                if (alimentacao.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");
                } else if (alimentacao.equalsIgnoreCase("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (classe.equalsIgnoreCase("mamifero")) {
                if (alimentacao.equalsIgnoreCase("onivoro")) {
                    System.out.println("homem");
                } else if (alimentacao.equalsIgnoreCase("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (vertebra.equalsIgnoreCase("invertebrado")) {
            if (classe.equalsIgnoreCase("inseto")) {
                if (alimentacao.equalsIgnoreCase("hematofago")) {
                    System.out.println("pulga");
                } else if (alimentacao.equalsIgnoreCase("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (classe.equalsIgnoreCase("anelideo")) {
                if (alimentacao.equalsIgnoreCase("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (alimentacao.equalsIgnoreCase("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
