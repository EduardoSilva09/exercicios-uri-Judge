/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class salBonus {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //String nome = sc.nextLine();
        double salario = sc.nextDouble();
        double valor= sc.nextDouble();
        
        double total = ((valor*15)/100)+salario;
       

        System.out.printf("TOTAL = R$ %.2f" , total);
        System.out.println("");
        sc.close();
    }
}
//        System.out.printf("TOTAL = %.2f", salario);
//        System.out.println("TOTAL = " + salario);
//        System.out.println("");