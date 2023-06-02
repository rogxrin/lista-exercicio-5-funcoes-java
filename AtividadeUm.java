import java.util.Scanner;

public class AtividadeUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double media = calcularMedia(numero1, numero2);
        System.out.println("A média aritmética é: " + media);
    }

    public static double calcularMedia(double num1, double num2) {
        return (num1 + num2) / 2;
    

    }

}
