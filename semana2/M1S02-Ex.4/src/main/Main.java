package main;

import models.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite um valor: ");
        double n1 = entrada.nextDouble();
        System.out.println("Por favor, digite um valor: ");
        double n2 = entrada.nextDouble();
        System.out.println("Por favor, escolha qual operação deseja realizar: 1 - Adição, 2 - Subtração, 3 - Multiplicação ou 4 - Divisão");
        int operacao = entrada.nextInt();

        Calculator calculator = new Calculator(n1, n2, operacao);
        System.out.println(calculator.getCalculator());
    }
}