package models;

public class Calculator {
    public double n1;
    public double n2;
    public int operacao;

    public Calculator(double n1, double n2, int operacao) {
        this.n1 = n1;
        this.n2 = n2;
        this.operacao = operacao;
    }

    public double getCalculator() {
        return switch (operacao) {
            case 1 -> n1 + n2;
            case 2 -> n1 - n2;
            case 3 -> n1 * n2;
            case 4 -> n1 / n2;
            default -> 0;
        };
    }
}
