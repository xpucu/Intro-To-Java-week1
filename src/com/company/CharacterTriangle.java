package com.company;

import java.util.Scanner;

/**
 * Created by Xpucu on 10/14/2015.
 */
public class CharacterTriangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++){
                System.out.print((char)(j + 97) + " ");
            }
            System.out.println();
        }

        for (int i = number - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (j + 97) + " ");
            }
            System.out.println();
        }
    }
}
