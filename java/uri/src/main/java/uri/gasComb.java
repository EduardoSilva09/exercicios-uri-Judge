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
public class gasComb {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int  th, vkm; //tempo em horas e velocidadde em km
        
        th = sc.nextInt();
        vkm = sc.nextInt();
        
        double litro = th*vkm;
        litro/=12;
        System.out.printf("%.3f",litro);
        System.out.println("");
        sc.close();
    }
}
