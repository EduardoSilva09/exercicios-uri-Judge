/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class bhaskara {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.#####");//formatando a saida 

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double delta = (B * B) - (4 * A * C);
        double div = (2 * A);
        
        double x1 = (-(B) + Math.sqrt(delta)) / div; // sqrt raiz quadrada
        double x2 = (-(B) - Math.sqrt(delta)) / div;

        if (delta >= 0 && div >0) {
            System.out.println("R1 = " + df.format(x1));
            System.out.println("R2 = " + df.format(x2));
        } else {
            System.out.println("Impossivel calcular");
        }
        sc.close();
    }
}
