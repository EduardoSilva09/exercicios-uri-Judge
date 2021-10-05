package uri;

import java.util.Scanner;

public class sortSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[3];
        int[] input = new int[3];
        int aux = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            input[i] = numbers[i];
        }

        for (int i = 0; i < numbers.length -1; i++) {
            if (numbers[i] > numbers[i + 1]) { // 4 > 3
                aux = numbers[i + 1]; // aux = 3
                numbers[i + 1] = numbers[i]; // 3 = 4
                numbers[i] = aux; // 4 = 3
            }
        }

        for(int num: numbers){
            System.out.println(num);
        }

        System.out.println();

        for(int inp: input){
            System.out.println(inp);
        }

        sc.close();
    }
}