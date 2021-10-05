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
public class consumo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();// distancia percorrida
        double Y = sc.nextDouble();// combustivel gasto
        
        double v =X/Y;
        System.out.printf("%.3f km/l\n",v);
        sc.close();
    }
}
