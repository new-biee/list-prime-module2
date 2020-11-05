package com.listprime;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int n = 2;
        System.out.print("Enter numbers: ");
        String str = scanner.nextLine();
        int number = Integer.parseInt(str);

        while (count < number) {
            int i = 2;
            boolean flag = true;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
                i++;
            }
            if (flag) {
                System.out.printf("%d ", n);
                count++;
            }
            n++;
        }
    }
}
