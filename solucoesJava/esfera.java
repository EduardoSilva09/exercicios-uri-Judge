package uri;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class esfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double vol = (4.0 / 3) * 3.14159 * (r * r * r);
        System.out.printf("VOLUME = %.3f", vol);
        System.out.println("");
        sc.close();
    }
}
