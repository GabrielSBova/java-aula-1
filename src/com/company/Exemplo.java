package com.company;

import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {

        double nota;
        String nome;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();

        System.out.print("Dogote sua nota: ");
        nota = teclado.nextFloat();

        System.out.print("Seu nome é " + nome + "\n");
        System.out.printf("Sua nota é %.2f", nota);

    }
}