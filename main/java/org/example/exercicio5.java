package org.example;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String palavra;
        System.out.println("Digite uma palavra");
        palavra = s.nextLine();

        System.out.println();
        System.out.println("entrada: %s\n" + palavra);
        System.out.println("saida:  %s\n" + inverterCaracteres(palavra));


    }

    public static String inverterCaracteres(String s){
        int i,n;
        String sAux = "";

        n = s.length();
        for (i = (n-1); i >= 0;i--){
            sAux = sAux + s.charAt(i);
        }
        return (sAux);
    }
}
