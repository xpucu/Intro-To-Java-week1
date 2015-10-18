package com.company;

import java.util.Scanner;

/**
 * Created by Xpucu on 10/14/2015.
 */
public class SumNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        int result = 0;
        for (int i = 1; i <= number; i++) {

            result = result + i;
        }
            System.out.println(result);

    }
}