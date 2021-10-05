/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class lanche {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int v =sc.nextInt();
        if(i == 1) {
            System.out.printf("Total: R$ %.2f\n",(4.00*v));
        }
        if(i == 2) {
            System.out.printf("Total: R$ %.2f\n",(4.50*v));
        }
        if(i == 3) {
            System.out.printf("Total: R$ %.2f\n",(5.00*v));
        }
        if(i == 4) {
            System.out.printf("Total: R$ %.2f\n",(2.00*v));
        }
        if(i == 5) {
            System.out.printf("Total: R$ %.2f\n",(1.50*v));
        }
        sc.close();
    }
}
