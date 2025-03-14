import java.util.Scanner;

public class ImcCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String classification;

        System.out.println("Por favor, digite a sua altura:");
        double altura = keyboard.nextDouble();
        System.out.println("Por favor, digite o seu peso:");
        double peso = keyboard.nextDouble();

        double imc = peso/(altura*altura);

        if(imc < 18.5) {
            classification = "Abaixo do peso";
        } else if (imc > 18.5 && imc < 24.9) {
            classification = "Peso normal";
        } else if (imc > 25 && imc < 29.9) {
            classification = "Sobrepeso";
        } else if (imc > 30 && imc < 34.9) {
            classification = "Obesidade grau I";
        } else if (imc > 35 && imc < 39.9) {
            classification = "Obesidade grau II";
        } else {
            classification = "Obesidade grau III ou mórbida";
        }

        System.out.println("O seu IMC é:  " + imc +  " - " + classification);

    }
}
