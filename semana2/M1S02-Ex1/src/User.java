import java.util.Scanner;

public class User {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o seu sobrenome: ");
        String sobrename = input.nextLine();

        System.out.println("Por favor, digite o seu nome: ");
        String name = input.nextLine();

        System.out.println(name + " " + sobrename);
        System.out.println("O seu nome tem " + name.length() + " caracteres");
    }
}
