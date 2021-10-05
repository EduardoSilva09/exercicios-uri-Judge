package solucoesJava;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class media2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double A,B,C, media;
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        media = ((A*2) + (B*3) + (C*5))/10;
        System.out.printf("MEDIA = %.1f",media);
        System.out.println("");
        sc.close();
    }
}
