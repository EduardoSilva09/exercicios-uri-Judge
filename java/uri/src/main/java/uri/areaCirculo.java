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
public class areaCirculo {
    public static void main(String[] args) {
//        area = n* (raio*raio)
        Scanner sc = new Scanner(System.in);
        double n = 3.14159;
        double raio = sc.nextDouble();
        double area = n * (raio * raio);
        System.out.printf("A=%.4f\n", area);
        sc.close();
    }
}
