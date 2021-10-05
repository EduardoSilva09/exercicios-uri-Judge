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
public class calSimples {
    public static class peca{
        public int cod;
        public int num;
        public double valor;

        public peca(int cod, int num, double valor) {
            this.cod = cod;
            this.num = num;
            this.valor = valor;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //int cod = sc.nextInt();
        int num = sc.nextInt();
        double valor= sc.nextDouble();
        
        //int cod2 = sc.nextInt();
        int num2 = sc.nextInt();
        double valor2 = sc.nextDouble();
        
        double pagar= (num*valor)+(num2*valor2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f",pagar);
        System.out.println("");
        sc.close();
        
    }
}
