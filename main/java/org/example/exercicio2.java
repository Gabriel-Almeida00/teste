package org.example;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um número");
        numero = s.nextInt();

        System.out.println(isFibonacci(numero) ? numero + " é um número Fibonacci" :
                    numero + " Não é um número de Fibonacci");
    }


    static boolean isFibonacci(int n) {
        return isPerfectSquare(5 * n * n + 4) ||
                isPerfectSquare(5 * n * n - 4);
    }

    static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return (s * s == x);
    }
}

