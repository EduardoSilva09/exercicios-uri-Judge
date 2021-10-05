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
public class distanciaAB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        double v1 = x2 -x1;
        double v2 = y2 -y1;
        
        double Distancia = Math.sqrt((v1*v1)+(v2*v2));
        System.out.printf("%.4f\n",Distancia);
        sc.close();
    }
}
