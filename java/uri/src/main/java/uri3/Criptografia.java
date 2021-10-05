/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri3;

import java.util.Scanner;

/**
 *
 * @author Familia
 */
public class Criptografia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int line = sc.nextInt();
        String[] text = new String[line];

        for (int i = 0; i < text.length ; i++) {
            System.out.println( i + "°:");
            text[i] = sc.next();
        }
        
        //1° passada 
        sc.close();
    }
}
