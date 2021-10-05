package solucoesJava;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class bhaskara {
    public static void mais(String[] args){
        Scanner sc = new Scanner(System.in);
        //leia três valores
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double raiz;
        
        raiz = ((B*B) - 4*A*C);
        double x =(- B + Math.sqrt(raiz));
        double r= x/(2*A);
        double x1 =(- B - Math.sqrt(raiz));
        double r1= x1/(2*A);
        
        System.out.println("R1 = "+ r);
        System.out.println("R2 = "+ r1);
        sc.close();
    }
}
