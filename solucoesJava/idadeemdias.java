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
public class idadeemdias {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int idade = sc.nextInt();
        
        System.out.println(idade/365+" ano(s)");
        idade= idade%365;
        System.out.println(idade/30+" mes(es)");
        idade= idade%30;
        System.out.println(idade/1+" dia(s)");
        
        sc.close();
    }
}
