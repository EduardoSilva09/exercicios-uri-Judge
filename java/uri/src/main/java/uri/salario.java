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
public class salario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num,ht;
        double vph;
        
        num = sc.nextInt();
        ht= sc.nextInt();
        vph = sc.nextDouble();
        
        System.out.println("NUMBER = "+num);
        System.out.printf("SALARY = U$ %.2f",(ht*vph));
        System.out.println("");
        sc.close();
    }
}
