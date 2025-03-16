package main;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println("Adivinhe o número de 1 a 5 que estou pensando: ");
        int numEscolhido = entrada.nextInt();

        if (numEscolhido < 1 || numEscolhido > 5) {
            System.out.println("Só pode números entre 1 e 5");
        } else {
            int numSorteado = gerador.nextInt(5) + 1;

            if (numSorteado == numEscolhido) {
                System.out.println("Parabéns! Você acertou!");
            } else {
                System.out.println("Você errou!");
            }
        }
    }
}