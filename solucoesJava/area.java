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
public class area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        double atr =(A*C)/2;//area do triangulo retangulo
        double ac=3.14159*(C*C);//area do circulo
        double at=((A+B)*C)/2; //area do trapézio
        double aq=B*B; //area do quadrado
        double ar =A*B; // area do retângulo
        
        System.out.printf("TRIANGULO: %.3f\n",atr);
        System.out.printf("CIRCULO: %.3f\n",ac);
        System.out.printf("TRAPEZIO: %.3f\n",at);
        System.out.printf("QUADRADO: %.3f\n",aq);
        System.out.printf("RETANGULO: %.3f\n",ar);
        sc.close();
    }
}
